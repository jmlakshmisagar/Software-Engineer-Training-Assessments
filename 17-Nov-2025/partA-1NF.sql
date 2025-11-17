-- q1: student phones 1nf
create table student (
    studentid int primary key,
    name varchar(50)
);

create table student_phone (
    studentid int,
    phone varchar(20),
    foreign key (studentid) references student(studentid)
);

insert into student values
(101, 'ravi'),
(102, 'anita'),
(103, 'john');

insert into student_phone values
(101, '98765'),
(101, '87654'),
(102, '99900'),
(103, '88888'),
(103, '77777'),
(103, '66666');

---------------------------------------------------------

-- q2: order items 1nf
create table orders (
    orderid varchar(10) primary key,
    customer varchar(50)
);

create table order_items (
    orderid varchar(10),
    item varchar(50),
    foreign key (orderid) references orders(orderid)
);

insert into orders values
('o1', 'raj'),
('o2', 'sam'),
('o3', 'raj');

insert into order_items values
('o1', 'pen'),
('o1', 'pencil'),
('o2', 'notebook'),
('o3', 'eraser'),
('o3', 'marker'),
('o3', 'pen');

---------------------------------------------------------

-- q3: employee skills 1nf
create table employee (
    empid int primary key,
    empname varchar(50)
);

create table employee_skills (
    empid int,
    skill varchar(50),
    foreign key (empid) references employee(empid)
);

insert into employee values
(1, 'ramesh'),
(2, 'anita'),
(3, 'john');

insert into employee_skills values
(1, 'java'),
(1, 'python'),
(2, 'excel'),
(3, 'c++'),
(3, 'java'),
(3, 'html');

---------------------------------------------------------

-- q4: address atomic 1nf
create table customer (
    custid int primary key,
    name varchar(50),
    city varchar(50),
    state varchar(50),
    country varchar(50)
);

insert into customer values
(1, 'meera', 'hyderabad', 'telangana', 'india'),
(2, 'ajay', 'pune', 'maharashtra', 'india');
