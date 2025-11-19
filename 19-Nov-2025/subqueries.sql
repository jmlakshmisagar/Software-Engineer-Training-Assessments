43. select customernumber, sum(amount) as total_paid
    from payments
    group by customernumber
    having total_paid = (
        select max(total_payment)
        from (
            select sum(amount) as total_payment
            from payments
            group by customernumber
        ) t
    );

44. select * from employees
    where officecode = (
        select officecode
        from employees
        where firstname = 'diane' and lastname = 'murphy'
    );

45. select * from products
    where productcode not in (select productcode from orderdetails);

46. select c.customernumber, c.customername
    from customers c
    where (select sum(amount) from payments p where p.customernumber = c.customernumber)
          >
          (select avg(amount) from payments);

47. select productline
    from products
    group by productline
    having count(*) > 5;

48. select c.customernumber, c.customername
    from customers c
    where c.customernumber not in (select customernumber from payments);

49. select e.employeenumber, count(*) as customer_count
    from employees e
    join customers c on e.employeenumber = c.salesrepemployeenumber
    group by e.employeenumber
    having customer_count = (
        select max(customer_total)
        from (
            select count(*) as customer_total
            from customers
            group by salesrepemployeenumber
        ) t
    );

50. select productline, productcode, buyprice
    from products p
    where buyprice = (
        select max(buyprice)
        from products
        where productline = p.productline
    );

51. select customernumber, productcode
    from orderdetails od
    join orders o on od.ordernumber = o.ordernumber
    group by customernumber, productcode
    having count(*) > 1;
