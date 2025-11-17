-- q5: 2nf decomposition (pk = studentid, courseid)

create table student (
    studentid int primary key,
    studentname varchar(50)
);

create table course (
    courseid varchar(10) primary key,
    coursename varchar(50),
    faculty varchar(50)
);

create table student_course (
    studentid int,
    courseid varchar(10),
    marks int,
    primary key (studentid, courseid),
    foreign key (studentid) references student(studentid),
    foreign key (courseid) references course(courseid)
);

insert into student values
(1, 'ramesh'),
(2, 'anita');

insert into course values
('c1', 'java', 'amit'),
('c2', 'python', 'seema');

insert into student_course values
(1, 'c1', 90),
(1, 'c2', 85),
(2, 'c1', 78);

---------------------------------------------------------

-- q6: 2nf decomposition (pk = orderid, productid)

create table customer (
    orderid varchar(10) primary key,
    customername varchar(50)
);

create table product (
    productid varchar(10) primary key,
    productname varchar(50)
);

create table order_product (
    orderid varchar(10),
    productid varchar(10),
    quantity int,
    primary key (orderid, productid),
    foreign key (orderid) references customer(orderid),
    foreign key (productid) references product(productid)
);

insert into customer values
('o1', 'raj'),
('o2', 'meena');

insert into product values
('p1', 'pen'),
('p2', 'pencil');

insert into order_product values
('o1', 'p1', 2),
('o1', 'p2', 1),
('o2', 'p1', 3);

---------------------------------------------------------

-- q7: 2nf decomposition (pk = empid, projectid)

create table employee (
    empid int primary key,
    empname varchar(50)
);

create table project (
    projectid varchar(10) primary key,
    projectname varchar(50)
);

create table emp_project (
    empid int,
    projectid varchar(10),
    hoursworked int,
    primary key (empid, projectid),
    foreign key (empid) references employee(empid),
    foreign key (projectid) references project(projectid)
);

insert into employee values
(1, 'ravi'),
(2, 'anita');

insert into project values
('p1', 'webapp'),
('p2', 'mobileapp');

insert into emp_project values
(1, 'p1', 20),	
(1, 'p2', 30),
(2, 'p1', 25);

---------------------------------------------------------

-- q8: 2nf decomposition (pk = driverid, routeid)

create table driver (
    driverid varchar(10) primary key,
    drivername varchar(50)
);

create table route (
    routeid varchar(10) primary key,
    routename varchar(50),
    distance varchar(20)
);

create table driver_route (
    driverid varchar(10),
    routeid varchar(10),
    primary key (driverid, routeid),
    foreign key (driverid) references driver(driverid),
    foreign key (routeid) references route(routeid)
);

insert into driver values
('d1', 'amit'),
('d2', 'sunil');

insert into route values
('r1', 'airport route', '40 km'),
('r2', 'city route', '20 km');

insert into driver_route values
('d1', 'r1'),
('d1', 'r2'),
('d2', 'r1');

---------------------------------------------------------

-- q9: first convert to 1nf (quantities atomic), then to 2nf

create table customer (
    orderid varchar(10),
    customername varchar(50),
    city varchar(50),
    primary key (orderid)
);

create table product (
    productid varchar(10) primary key,
    productname varchar(50),
    price int
);

create table order_product (
    orderid varchar(10),
    productid varchar(10),
    quantity int,
    primary key (orderid, productid, quantity),
    foreign key (orderid) references customer(orderid),
    foreign key (productid) references product(productid)
);

insert into customer values
('o1', 'ravi', 'mumbai'),
('o2', 'meena', 'delhi');

insert into product values
('p1', 'pen', 10),
('p2', 'book', 100),
('p3', 'bag', 500);

insert into order_product values
('o1', 'p1', 2),
('o1', 'p1', 3),
('o2', 'p2', 1),
('o2', 'p3', 1),
('o2', 'p3', 2);
