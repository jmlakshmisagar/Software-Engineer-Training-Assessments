33. select o.ordernumber, o.orderdate, c.customername
    from orders o
    inner join customers c on o.customernumber = c.customernumber;

34. select e.firstname as employee, m.firstname as manager
    from employees e
    left join employees m on e.reportsto = m.employeenumber;

35. select p.productcode, p.productname, sum(od.quantityordered) as total_ordered
    from products p
    join orderdetails od on p.productcode = od.productcode
    group by p.productcode;

36. select c.customernumber, c.customername
    from customers c
    left join orders o on c.customernumber = o.customernumber
    where o.customernumber is null;

37. select o.officecode, o.city, e.firstname, e.lastname
    from offices o
    left join employees e on o.officecode = e.officecode;

38. select od.ordernumber, p.productname, od.quantityordered, od.priceeach
    from orderdetails od
    join products p on od.productcode = p.productcode;

39. select c.customername, e.firstname, e.lastname
    from customers c
    left join employees e on c.salesrepemployeenumber = e.employeenumber;

40. select o.city, e.firstname, e.lastname
    from offices o
    left join employees e on o.officecode = e.officecode;

41. select * from orders
    where shippeddate is null;

42. select p.paymentdate, p.amount, pl.productline
    from payments p
    join customers c on p.customernumber = c.customernumber
    join orders o on c.customernumber = o.customernumber
    join orderdetails od on o.ordernumber = od.ordernumber
    join products pr on od.productcode = pr.productcode
    join productlines pl on pr.productline = pl.productline;
