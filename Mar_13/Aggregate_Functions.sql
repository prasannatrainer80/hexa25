-- Aggregate Functions 

-- sum() : Used to perform sum operation on the given numeric field

select sum(sal) from Emp;

-- avg() : Used to perform avg operation on the given numerif field

select avg(sal) from Emp;

-- max() : Used to display max value 

select max(sal) from Emp;

-- min() : Used to display min value 

select min(sal) from Emp;

-- count(): Used to display total no.of records 

select count(comm) from Emp; -- it returns 4 as for 4 records comm is not null

-- to dispaly total no.of records then we need to use

select count(*) from Emp;

-- Group By : Used to generate summary reports based on the field specified. 

select job, sum(sal) from Emp
group by job;

select job, avg(sal) from EMp
group by job;

select job, max(sal) from Emp 
group by Job;

-- Display no.of employees working in each dept/job 

select job, count(*) 
from emp 
group by Job;

-- In Agent table, show count w.r.t. Gender wise

select Gender, count(*) 
from Agent group by gender;

-- Having : This clause used to check conditions on aggregate fields

-- display all records whose dept total salary crosses 5k


select job, sum(sal) from Emp
group by job
having sum(sal) >= 5000;

-- Display all records which dept contains more than one employee 

select job,count(*) from Emp 
group by job 
having count(*) > 1;

select job,count(*) from Emp 
group by job 
having count(*) > 1
order by job;


