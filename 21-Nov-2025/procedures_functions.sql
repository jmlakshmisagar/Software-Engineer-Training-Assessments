
delimiter $$
create procedure showEmployees()
begin
	select * from employees;
end $$

call showEmployees();
-- ----------------------------------------------------------------


DELIMITER $$
CREATE PROCEDURE findCustomer(IN id INT)
BEGIN
    SELECT * FROM customers WHERE customerNumber = id;
END $$
DELIMITER ;

-- Call the procedure
CALL findCustomer(103);

-- ----------------------------

delimiter $$

create procedure findEmployee(out c int)
begin
	select count(*) into c from employees;
end;


call findEmployee(@c);
select @c;

-- --------------------------------------

delimiter $$
create procedure returnValues2(inout s int)
begin
	set s =s+1;
end$$



set @c = 10;
call returnValues2(@c);
select @c;

-- check wheathe the give salary is high or not 

delimiter $$

create procedure checkSalary1(in salary int)
begin
	if salary > 60000 then
    select 'high' as result;
    else 
    select 'normal' as result;
    end if;
end $$

delimiter ;

call checkSalary1(8000);



-- -------------------------------------------------

select * from student;

delimiter $$

create procedure studentResult(in marks int)
begin
	if marks >= 80 then 
		select 'A' as grade;
	elseif
		marks >= 70 then
		select 'B' as grade;
	else
		select 'C' as grade;
	end if;
end $$

delimiter ;

call studentResult(70);


-- select id, name, call studentResult(marks) from student;



delimiter $$
create procedure looper(in num int)
begin
	declare i int default 1;
    create temporary table counter(i int);
    while i <= num
		do
			insert into counter values(i);
			set i = i+1;
		end while;
        select * from counter;
end $$
delimiter ;

drop procedure if exists looper;

call looper(10);

show tables;


-- --------------------------------------------------------------------------------------------



delimiter $$
create function studentResults(marks int)
returns varchar(10)
deterministic
begin
	declare grade varchar(10);
	if marks >= 80 then 
		set grade = 'A';
	elseif
		marks >= 70 then
		set grade = 'B';
	else
		set grade = 'C';
	end if;
    return grade;
end $$

delimiter ;

select id, name, studentResults(marks) from student;
