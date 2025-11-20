-- 1. employees earning more than lowest salary.
select employee_id, employee_name, salary
from employees
where salary > (
        select min(salary) from employees
    );

-- 2. departments where avg salary > 50000.
select department_id, avg(salary) as avg_salary
from employees
group by department_id
having avg(salary) > 50000;

-- 3. employees joined before earliest hr joining date.
select employee_id, employee_name, joining_date
from employees
where joining_date < (
        select min(joining_date)
        from employees
        where department = 'hr'
    );

-- 4. employee list with total employee count.
select employee_id, employee_name,
    (select count(*) from employees) as total_employees
from employees;

-- 5. employees not belonging to any department.
select employee_id, employee_name
from employees
where department_id is null;
