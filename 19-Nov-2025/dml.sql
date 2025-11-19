1. insert into customers (customernumber, customername, contactlastname, contactfirstname, phone, addressline1, city, country)
   values (999, 'new india customer', 'kumar', 'rajesh', '9999999999', 'street 1', 'mumbai', 'india');

2. update customers
   set creditlimit = creditlimit * 1.10
   where country = 'germany';

3. delete from orders
   where orderdate < '2005-01-01';

4. insert into products (productcode, productname, productline, productscale, productvendor, productdescription, quantityinstock, buyprice, msrp)
   values ('s99_9999', 'new classic car', 'classic cars', '1:18', 'autoart', 'sample description', 100, 50.00, 95.00);

5. insert into payments (customernumber, checknumber, paymentdate, amount)
   values (103, 'chk99999', '2024-01-01', 5000.00);

6. update offices
   set phone = '+44 20 1234 5678'
   where city = 'london';

7. delete from products
   where productcode not in (select productcode from orderdetails);

8. insert into employees (employeenumber, lastname, firstname, extension, email, officecode, reportsto, jobtitle)
   values (2000, 'rao', 'manish', 'x1234', 'manish@company.com', '1', 1002, 'sales rep');
