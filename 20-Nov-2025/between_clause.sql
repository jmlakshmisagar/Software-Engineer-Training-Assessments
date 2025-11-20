-- 1. retrieve employees whose salary is between the minimum and maximum salary of the it department.
select employee_id, employee_name, salary
from employees
where salary between (
        select min(salary) from employees where department = 'it'
    )
    and (
        select max(salary) from employees where department = 'it'
    );

-- 2. find students whose marks are between the class average and the highest marks.
select student_id, student_name, marks
from students
where marks between (
        select avg(marks) from students
    )
    and (
        select max(marks) from students
    );

-- 3. display products priced between the cheapest and the average product price.
select product_id, product_name, price
from products
where price between (
        select min(price) from products
    )
    and (
        select avg(price) from products
    );

-- 4. get all orders placed between the first and last order date of customer id = 10.
select order_id, customer_id, order_date
from orders
where order_date between (
        select min(order_date) from orders where customer_id = 10
    )
    and (
        select max(order_date) from orders where customer_id = 10
    );

-- 5. list employees whose joining date is between the earliest and latest joining date in their department.
select e.employee_id, e.employee_name, e.joining_date, e.department
from employees e
where e.joining_date between (
        select min(joining_date) from employees where department = e.department
    )
    and (
        select max(joining_date) from employees where department = e.department
    );

-- 6. show departments where total salary is between the minimum and maximum department salary across all departments.
select department_id, sum(salary) as total_salary
from employees
group by department_id
having sum(salary) between (
        select min(total_dept_salary)
        from (
            select sum(salary) as total_dept_salary
            from employees
            group by department_id
        ) t
    )
    and (
        select max(total_dept_salary)
        from (
            select sum(salary) as total_dept_salary
            from employees
            group by department_id
        ) t
    );

-- 7. find customers whose total purchase amount is between the average purchase and the highest purchase.
select customer_id, sum(amount) as total_purchase
from purchases
group by customer_id
having sum(amount) between (
        select avg(total_amt)
        from (
            select sum(amount) as total_amt
            from purchases
            group by customer_id
        ) t
    )
    and (
        select max(total_amt)
        from (
            select sum(amount) as total_amt
            from purchases
            group by customer_id
        ) t
    );

-- 8. retrieve books priced between the minimum price of 'fiction' category and maximum price of 'science' category.
select book_id, title, price, category
from books
where price between (
        select min(price) from books where category = 'fiction'
    )
    and (
        select max(price) from books where category = 'science'
    );

-- 9. get all employees whose bonuses fall between the lowest and highest bonus given in the last year.
select employee_id, employee_name, bonus
from employee_bonus
where bonus between (
        select min(bonus) from employee_bonus where bonus_year = year(curdate()) - 1
    )
    and (
        select max(bonus) from employee_bonus where bonus_year = year(curdate()) - 1
    );

-- 10. find locations where rainfall is between the minimum and maximum rainfall recorded this month.
select location_id, location_name, rainfall
from rainfall_data
where rainfall between (
        select min(rainfall) from rainfall_data where month = month(curdate())
    )
    and (
        select max(rainfall) from rainfall_data where month = month(curdate())
    );
