17. select customernumber, sum(amount) as total_payments
    from payments
    group by customernumber;

18. select customernumber, count(*) as payment_count
    from payments
    group by customernumber
    having count(*) > 3;

19. select officecode, count(*) as employee_count
    from employees
    group by officecode;

20. select productline, avg(buyprice) as avg_price
    from products
    group by productline
    having avg(buyprice) > 100;

21. select c.customernumber, sum(od.quantityordered * od.priceeach) as total_order_amount
    from customers c
    join orders o on c.customernumber = o.customernumber
    join orderdetails od on o.ordernumber = od.ordernumber
    group by c.customernumber
    having total_order_amount > 50000;

22. select productcode, sum(quantityordered) as total_quantity
    from orderdetails
    group by productcode;

23. select status, count(*) as order_count
    from orders
    group by status;

24. select e.employeenumber, count(*) as team_size
    from employees e
    join employees s on e.employeenumber = s.reportsto
    group by e.employeenumber
    having count(*) > 2;
