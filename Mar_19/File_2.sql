Create Table Test
(
   id int, 
   name varchar(3),
   sal numeric(3,3)
);

-- add primary key on id column of Test table 

desc test;

alter table Test add primary key(id);

-- change the name field size to 20 chars 

alter table Test modify name varchar(20); 

-- change the sal field size to numeric(9,2) 

alter table Test modify sal numeric(9,2); 

-- add field gender to the table Test

alter table Test add gender enum('MALE','FEMALE'); 

-- add field dob to the table test as datetime

alter table Test add dob datetime; 

-- drop column dob and gender from test table 

alter table test drop column gender;

alter table test drop column dob;

desc test;