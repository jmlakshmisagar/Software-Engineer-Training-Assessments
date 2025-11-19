52. select now();

53. select count(*) as total_customers
    from customers;

54. select substring(customername, 1, 5) as short_name
    from customers;

55. select *
    from orders
    where datediff(now(), orderdate) <= 30;

56. select ordernumber, date_format(orderdate, '%d-%m-%Y') as formatted_date
    from orders;

57. select customername, length(customername) as name_length
    from customers;

58. select lower(lastname) as lastname_lower
    from employees;

59. select ordernumber,
           sum(quantityordered * priceeach) as total_sales
    from orderdetails
    group by ordernumber;

60. select year(paymentdate) as year, month(paymentdate) as month
    from payments;
