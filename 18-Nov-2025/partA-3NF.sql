/* ======================================================
   question 1: student–department table
   original (unnormalized)
   attributes: stud_id, stud_name, dept_id, dept_name, hod_id, hod_name
   fds:
     stud_id -> stud_name, dept_id
     dept_id -> dept_name, hod_id
     hod_id -> hod_name
   candidate key: stud_id
   transitive dependency: stud_id -> dept_id -> dept_name, hod_id -> hod_name
   normalize to 3nf -> student, department, hod (or combine dept & hod if desired)
   ======================================================*/

create table student_info_orig (
  stud_id int primary key,
  stud_name varchar(100),
  dept_id int,
  dept_name varchar(100),
  hod_id int,
  hod_name varchar(100)
);

insert into student_info_orig values
(1, 'anita', 10, 'cse', 100, 'dr. rao'),
(2, 'ramesh', 20, 'ece', 200, 'dr. mehta'),
(3, 'sonia', 10, 'cse', 100, 'dr. rao');

create table student (
  stud_id int primary key,
  stud_name varchar(100),
  dept_id int not null
);

create table department (
  dept_id int primary key,
  dept_name varchar(100),
  hod_id int
);

create table hod (
  hod_id int primary key,
  hod_name varchar(100)
);

insert into hod values (100, 'dr. rao'), (200, 'dr. mehta');
insert into department values (10, 'cse', 100), (20, 'ece', 200);
insert into student values (1, 'anita', 10), (2, 'ramesh', 20), (3, 'sonia', 10);

/* ======================================================
   question 2: employee–project table
   original: emp_project(emp_id, emp_name, proj_id, proj_name, client_id, client_name)
   fds:
     emp_id -> emp_name
     proj_id -> proj_name, client_id
     client_id -> client_name
   likely pk for original combined table: (emp_id, proj_id)
   normalize to 3nf: employee, project, client, emp_project_assign
   ======================================================*/

create table emp_project_orig (
  emp_id int,
  emp_name varchar(100),
  proj_id int,
  proj_name varchar(100),
  client_id int,
  client_name varchar(100),
  primary key (emp_id, proj_id)
);

insert into emp_project_orig values
(101, 'vikram', 9001, 'portalredesign', 5001, 'acme corp'),
(102, 'priya', 9002, 'mobileapp', 5002, 'beta llc'),
(101, 'vikram', 9002, 'mobileapp', 5002, 'beta llc');

create table employee (
  emp_id int primary key,
  emp_name varchar(100)
);

create table client (
  client_id int primary key,
  client_name varchar(100)
);

create table project (
  proj_id int primary key,
  proj_name varchar(100),
  client_id int references client(client_id)
);

create table emp_project_assign (
  emp_id int references employee(emp_id),
  proj_id int references project(proj_id),
  primary key (emp_id, proj_id)
);

insert into employee values (101, 'vikram'), (102, 'priya');
insert into client values (5001, 'acme corp'), (5002, 'beta llc');
insert into project values (9001, 'portalredesign', 5001), (9002, 'mobileapp', 5002);
insert into emp_project_assign values (101, 9001), (102, 9002), (101, 9002);

/* ======================================================
   question 3: library books table
   original: library(book_id, book_title, author_id, author_name, publisher_id, publisher_name)
   fds:
     book_id -> book_title, author_id, publisher_id
     author_id -> author_name
     publisher_id -> publisher_name
   normalize to 3nf: book, author, publisher
   ======================================================*/

create table library_orig (
  book_id int primary key,
  book_title varchar(200),
  author_id int,
  author_name varchar(100),
  publisher_id int,
  publisher_name varchar(100)
);

insert into library_orig values
(301, 'database systems', 401, 'elmasri', 601, 'pearson'),
(302, 'algorithms', 402, 'cormen', 602, 'mit press'),
(303, 'operating systems', 403, 'tanenbaum', 601, 'pearson');

create table author (
  author_id int primary key,
  author_name varchar(100)
);

create table publisher (
  publisher_id int primary key,
  publisher_name varchar(100)
);

create table book (
  book_id int primary key,
  book_title varchar(200),
  author_id int references author(author_id),
  publisher_id int references publisher(publisher_id)
);

insert into author values (401, 'elmasri'), (402, 'cormen'), (403, 'tanenbaum');
insert into publisher values (601, 'pearson'), (602, 'mit press');
insert into book values
(301, 'database systems', 401, 601),
(302, 'algorithms', 402, 602),
(303, 'operating systems', 403, 601);

/* ======================================================
   question 4: sales table
   original: sales(sale_id, product_id, product_name, category, category_discount)
   fds:
     sale_id -> product_id
     product_id -> product_name, category
     category -> category_discount
   transitive dependency: sale_id -> product_id -> category -> category_discount
   normalize to 3nf: sales (transactions), product, category
   ======================================================*/

create table sales_orig (
  sale_id int primary key,
  product_id int,
  product_name varchar(100),
  category varchar(50),
  category_discount decimal(5,2)
);

insert into sales_orig values
(7001, 8001, 'usb cable', 'accessories', 5.00),
(7002, 8002, 'wireless mouse', 'accessories', 5.00),
(7003, 8003, 'smartphone', 'electronics', 10.00);

create table category (
  category varchar(50) primary key,
  category_discount decimal(5,2)
);

create table product (
  product_id int primary key,
  product_name varchar(100),
  category varchar(50) references category(category)
);

create table sales (
  sale_id int primary key,
  product_id int references product(product_id)
);

insert into category values ('accessories', 5.00), ('electronics', 10.00);
insert into product values (8001, 'usb cable', 'accessories'), (8002, 'wireless mouse', 'accessories'), (8003, 'smartphone', 'electronics');
insert into sales values (7001, 8001), (7002, 8002), (7003, 8003);

/* ======================================================
   question 5: student course enrollment
   original: enroll(roll_no, stud_name, course_id, course_name, credits)
   fds:
     roll_no -> stud_name
     course_id -> course_name, credits
   pk: (roll_no, course_id)
   normalize to student, course, enrollment
   ======================================================*/

create table enroll_orig (
  roll_no int,
  stud_name varchar(100),
  course_id varchar(10),
  course_name varchar(100),
  credits int,
  primary key (roll_no, course_id)
);

insert into enroll_orig values
(501, 'karan', 'cs101', 'introcs', 4),
(502, 'leena', 'cs101', 'introcs', 4),
(501, 'karan', 'ma101', 'calculus', 3);

create table student_en (
  roll_no int primary key,
  stud_name varchar(100)
);

create table course_en (
  course_id varchar(10) primary key,
  course_name varchar(100),
  credits int
);

create table enrollment (
  roll_no int references student_en(roll_no),
  course_id varchar(10) references course_en(course_id),
  primary key (roll_no, course_id)
);

insert into student_en values (501, 'karan'), (502, 'leena');
insert into course_en values ('cs101', 'introcs', 4), ('ma101', 'calculus', 3);
insert into enrollment values (501, 'cs101'), (502, 'cs101'), (501, 'ma101');
