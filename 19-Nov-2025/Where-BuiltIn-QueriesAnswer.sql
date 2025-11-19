USE classicmodels_mphasis;
show tables;
desc orders;
desc products;
desc orderdetails;

delete from products
where productCode not in (select distinct productCode from orderdetails);

select * from customers;
select * from customers where creditLimit > 50000;

select * from orders;
select * from orders where status = 'shipped' and year(orderdate) = '2004';

select now();
select count(*) from customers;

select substring(customerName,1,5) from customers;

select * from orders where datediff(shippedDate, orderDate ) < 2;

-- update orders set date_format(orderDate,'dd-mm-yyyy');

select customerName, length(customerName) from  customers;

update customers set contactLastName = lower(contactLastName);

select * from  orderdetails;

select (quantityOrdered * priceEach ) as Total from orderdetails;

select * from payments;

select concat(year(paymentDate), ' - ',month(paymentDate)) as Date from payments;
