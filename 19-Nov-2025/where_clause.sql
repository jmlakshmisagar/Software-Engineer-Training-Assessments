9. select * from customers
   where creditlimit > 50000;

10. select * from employees
    where officecode = (select officecode from offices where city = 'san francisco');

11. select * from orders
    where status = 'shipped'
      and year(orderdate) = 2004;

12. select * from products
    where buyprice between 50 and 100;

13. select * from employees
    where reportsto = 1143;

14. select * from customers
    where city like 's%';

15. select * from orders
    where comments like '%urgent%';

16. select * from payments
    where year(paymentdate) = 2003;
