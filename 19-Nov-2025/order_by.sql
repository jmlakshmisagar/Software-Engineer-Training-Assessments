25. select * from customers
    where country = 'france'
    order by creditlimit desc;

26. select * from products
    order by quantityinstock asc;

27. select * from payments
    order by paymentdate desc;

28. select * from employees
    order by jobtitle, lastname;

29. select * from customers
    order by creditlimit desc
    limit 5;

30. select * from productlines
    order by productline;

31. select * from orders
    order by orderdate asc
    limit 10;

32. select * from products
    order by productline, buyprice;
