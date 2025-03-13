select * from Dept;

-- Write a query ensure for dept table 
-- if dname is 'ACCOUNTING' manager is 'Karthik'
-- if dname is 'RESEARCH' then manager is 'Arya'
-- if dname is 'SALES' then manager is 'Harsh'
-- if dname is 'OPERATIONS' then manager is 'Anuvarshini'

select deptno, dname,loc,
case dname 
   WHEN 'ACCOUNTING' THEN 'Karthik'
   WHEN 'RESEARCH' THEN 'Arya'
   WHEN 'SALES' THEN 'Harsh'
   WHEN 'OPERATIONS' THEN 'Anuvarshini'
end 'Manager'
from Dept;

select * from Emp;

select distinct job from Emp;

-- write a query to display HeadName as 
-- if job is 'CLERK' then 'Balasubramani'
-- if job is 'SALESMAN' then 'HarshaVardhan'
-- if job is 'MANAGER' then 'Addlin'
-- if job is 'ANALYST' then 'Charuhasini'
-- if job is 'PRESIDENT' then 'No Manaager'

select Empno,ename,job,sal,
CASE JOB
  WHEN 'CLERK' THEN 'Balasubramani'
  WHEN 'SALESMAN' THEN 'Harshavardhan'
  WHEN 'MANAGER' THEN 'Addlin'
  WHEN 'ANALYST' THEN 'Charuhasini' 
  WHEN 'PRESIDENT' THEN 'No MANAGER'
END 'Head Name'
from Emp;

-- Write a query from Agent table, as if maritalStatus is 0 then unmarried if maritalStatus is 1
-- then married

select AgentId, FirstName, LastName, City,State,
CASE MaritalStatus
  WHEN 0 THEN 'Unmarried'
  WHEN 1 THEN 'Married'
End 'Mstatus'
from Agent ;

-- Display info from Emp table where comm is null 

select * from Emp where comm is NULL; 

select Empno,Ename,job,sal,comm from Emp;

-- Write a query as if comm is null then print as 0 

select empno, ename, job, sal, comm ,
case 
when comm is NULL THEN 0 else comm end 'comm'
from Emp;

-- Write a query to geneate takeHome as if comm is NULL then sal as takehome
-- else sal+comm as takehome 

select empno, ename, job, sal, comm ,
case 
when comm is NULL THEN 0 else comm end 'comm',
CASE 
WHEN COMM IS NULL THEN SAL ELSE SAL+COMM ENd 'TakeHome'
from Emp;

