/* ======================================================
   question 6: course–faculty (bcnf)
   original: course_faculty(course_code, course_name, faculty_id, faculty_name, room_no)
   fds:
     course_code -> course_name, faculty_id
     faculty_id -> faculty_name, room_no
     room_no -> faculty_id
   normalize to faculty, course_cf, room
   ======================================================*/

create table course_faculty_orig (
  course_code varchar(10) primary key,
  course_name varchar(100),
  faculty_id int,
  faculty_name varchar(100),
  room_no varchar(10)
);

insert into course_faculty_orig values
('cse201', 'datastructures', 701, 'dr. iyer', 'r1'),
('ece101', 'signals', 702, 'dr. gupta', 'r2'),
('cse301', 'algorithms', 701, 'dr. iyer', 'r1');

create table faculty (
  faculty_id int primary key,
  faculty_name varchar(100),
  room_no varchar(10)
);

create table course_cf (
  course_code varchar(10) primary key,
  course_name varchar(100),
  faculty_id int references faculty(faculty_id)
);

create table room (
  room_no varchar(10) primary key,
  faculty_id int references faculty(faculty_id)
);

insert into faculty values (701, 'dr. iyer', 'r1'), (702, 'dr. gupta', 'r2');
insert into course_cf values ('cse201', 'datastructures', 701), ('ece101', 'signals', 702), ('cse301', 'algorithms', 701);
insert into room values ('r1', 701), ('r2', 702);

/* ======================================================
   question 7: orders table (bcnf)
   original: orders(order_id, cust_id, cust_name, city, pincode)
   fds:
     order_id -> cust_id
     cust_id -> cust_name, city
     city -> pincode
   normalize to customer, city, orders
   ======================================================*/

create table orders_orig (
  order_id int primary key,
  cust_id int,
  cust_name varchar(100),
  city varchar(100),
  pincode varchar(10)
);

insert into orders_orig values
(90001, 3001, 'sunil', 'bengaluru', '560001'),
(90002, 3002, 'asha', 'mysore', '570001');

create table city (
  city varchar(100) primary key,
  pincode varchar(10)
);

create table customer (
  cust_id int primary key,
  cust_name varchar(100),
  city varchar(100) references city(city)
);

create table orders (
  order_id int primary key,
  cust_id int references customer(cust_id)
);

insert into city values ('bengaluru', '560001'), ('mysore', '570001');
insert into customer values (3001, 'sunil', 'bengaluru'), (3002, 'asha', 'mysore');
insert into orders values (90001, 3001), (90002, 3002);

/* ======================================================
   question 8: hostel room allocation (bcnf)
   original: hostel(room_no, student_id, student_name, warden_id, warden_name)
   fds:
     student_id -> student_name, room_no
     room_no -> warden_id
     warden_id -> warden_name
   normalize to student_hostel, room_hostel, warden, allocation
   ======================================================*/

create table hostel_orig (
  room_no varchar(10),
  student_id int primary key,
  student_name varchar(100),
  warden_id int,
  warden_name varchar(100)
);

insert into hostel_orig values
('h101', 1101, 'aditya', 900, 'mr. kumar'),
('h102', 1102, 'nisha', 901, 'ms. roy');

create table warden (
  warden_id int primary key,
  warden_name varchar(100)
);

create table room_hostel (
  room_no varchar(10) primary key,
  warden_id int references warden(warden_id)
);

create table student_hostel (
  student_id int primary key,
  student_name varchar(100)
);

create table allocation (
  student_id int references student_hostel(student_id) primary key,
  room_no varchar(10) references room_hostel(room_no)
);

insert into warden values (900, 'mr. kumar'), (901, 'ms. roy');
insert into room_hostel values ('h101', 900), ('h102', 901);
insert into student_hostel values (1101, 'aditya'), (1102, 'nisha');
insert into allocation values (1101, 'h101'), (1102, 'h102');

/* ======================================================
   question 9: hospital table (bcnf)
   original: hospital(doc_id, doc_name, patient_id, patient_name, disease, room_no, room_type)
   fds:
     doc_id -> doc_name
     patient_id -> patient_name, disease, room_no
     room_no -> room_type
   normalize to doctor, patient, room_hosp
   ======================================================*/

create table hospital_orig (
  doc_id int,
  doc_name varchar(100),
  patient_id int primary key,
  patient_name varchar(100),
  disease varchar(100),
  room_no varchar(10),
  room_type varchar(50)
);

insert into hospital_orig values
(4001, 'dr. sharma', 2101, 'kavya', 'fever', 'r201', 'private'),
(4002, 'dr. singh', 2102, 'manoj', 'fracture', 'r101', 'semi-private');

create table doctor (
  doc_id int primary key,
  doc_name varchar(100)
);

create table room_hosp (
  room_no varchar(10) primary key,
  room_type varchar(50)
);

create table patient (
  patient_id int primary key,
  patient_name varchar(100),
  disease varchar(100),
  room_no varchar(10) references room_hosp(room_no),
  doc_id int references doctor(doc_id)
);

insert into doctor values (4001, 'dr. sharma'), (4002, 'dr. singh');
insert into room_hosp values ('r201', 'private'), ('r101', 'semi-private');
insert into patient values (2101, 'kavya', 'fever', 'r201', 4001), (2102, 'manoj', 'fracture', 'r101', 4002);

/* ======================================================
   question 10: custom bcnf problem
   original: business(biz_id, biz_name, owner_id, owner_name, location_id, location_name, tax_id, tax_rate)
   fds:
     biz_id -> biz_name, owner_id, location_id, tax_id
     owner_id -> owner_name
     location_id -> location_name
     tax_id -> tax_rate
     location_name -> tax_id
   normalize to owner, location_tbl, tax, business
   ======================================================*/

create table business_orig (
  biz_id int primary key,
  biz_name varchar(200),
  owner_id int,
  owner_name varchar(100),
  location_id int,
  location_name varchar(100),
  tax_id int,
  tax_rate decimal(5,2)
);

insert into business_orig values
(8001, 'shawarmaking', 501, 'ravi', 301, 'chitradurga', 701, 18.00),
(8002, 'quicklabs', 502, 'smita', 302, 'bengaluru', 702, 12.00),
(8003, 'eggfarm', 503, 'kamal', 301, 'chitradurga', 701, 18.00);

create table owner (
  owner_id int primary key,
  owner_name varchar(100)
);

create table tax (
  tax_id int primary key,
  tax_rate decimal(5,2)
);

create table location_tbl (
  location_id int primary key,
  location_name varchar(100),
  tax_id int references tax(tax_id)
);

create table business (
  biz_id int primary key,
  biz_name varchar(200),
  owner_id int references owner(owner_id),
  location_id int references location_tbl(location_id)
);

insert into owner values (501, 'ravi'), (502, 'smita'), (503, 'kamal');
insert into tax values (701, 18.00), (702, 12.00);
insert into location_tbl values (301, 'chitradurga', 701), (302, 'bengaluru', 702);
insert into business values (8001, 'shawarmaking', 501, 301), (8002, 'quicklabs', 502, 302), (8003, 'eggfarm', 503, 301);
