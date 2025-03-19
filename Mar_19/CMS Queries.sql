SELECT * FROM cmstest.customer;

-- Display customer details who have wallet details

select * from customer where cus_id = ANY(select CUS_ID from wallet); 

-- Display customer Id and no.of wallets they have 

select Cus_ID,count(*) from Wallet 
group by Cus_ID;


-- Display customer details who have more than one wallet 

select cus_id,count(*) from wallet 
Group By Cus_Id
having count(*) > 1; 

-- Display customer Name who have more than one wallet 

select cus_Name from customer where cus_Id = ANY(
select cus_id from wallet 
Group By Cus_Id
having count(*) > 1);

-- Display Customer Details who don't have wallet 

select * from customer where cus_ID <> ALL(select cus_ID from Wallet); 

-- Display Customer details whose no.of chars in name are greater than 9121 cus_Id

select * from customer where length(cus_name) > 
(select length(cus_name) from customer where cus_id=9121); 

select * from customer;

-- Display all details for which cus_password not contains @ symbol 

select * from customer where cus_password not like '%@%';

select * from orders;

-- Display Customer Id and no.of ordrs placed 

select cus_id, count(*) from Orders 
group by cus_id;

-- Display Total amount paid by each customer from orders table

select cus_id, sum(ord_billAmount) from orders group by Cus_Id;

-- Display vendors and how many orders they got 

