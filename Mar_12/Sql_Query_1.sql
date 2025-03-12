-- How to change to HexaMarch database 

use hexamarch;

-- Display list of tables avaiable in current database 

show tables;

-- Display information about Dept table 

desc Dept;

-- Display information about Emp Table 

desc Emp;

-- Display all records from Dept table 

select * from Dept;

-- Display all records from Emp table 

select * from Emp;

-- Display Empno, Ename, Job, Sal, mgr from Emp table  (PROJECT Operator) 

select Empno, Ename, job, sal, mgr 
from Emp;

-- Where Clause : Used to display filtered records (condition) 

-- Display info whose empno is 7900 

select * from Emp 
where Empno = 7900;

-- Display info whose Ename is 'KING' 

select * from Emp 
WHERE ENAME='KING';

-- Dispaly info whose Job is 'CLERK' 

select * from Emp 
WHERE Job='CLERK';

-- Display info whose Sal > 2000 

select * from Emp 
WHERE Sal > 2000;

-- BETWEEN...AND : Used to display records w.r.t. range specified 

-- Display Records whose Sal from 1000 to 2000 

select * from Emp 
WHERE SAL BETWEEN 1000 and 2000;

select * from Emp 
WHERE SAL NOT BETWEEN 1000 and 2000;

-- IN Caluse : Used to display multiple values for particular column 

-- Dispaly info whose Job is 'CLERK' or 'MANAGER' or 'ANALYST' 

select * from Emp 
where job in('CLERK','MANAGER','ANALYST');

select * from Emp 
where job NOT in('CLERK','MANAGER','ANALYST'); 

select * from EMP 
WHERE ENAME IN('WARD','SCOTT','FORD','JAMES');

-- LIKE Opeator : Used to display data w.r.t. Wild Cards 

-- Dispaly records whose Ename starts with S 

select * from Emp 
WHERE ENAME LIKE 'S%';

-- Display records whose Ename ends with 'S' 

select * from Emp 
WHERE Ename LIKE '%S';

-- _ used to check specific chars 

select * from Emp where ENAME LIKE 'J___S';

-- Order By : Used to display records w.r.t. specific field(s) in ascending or
	-- descending order
    
select Empno, Ename, job, sal, Hiredate 
from Emp order By Ename;

select Empno, Ename, job, sal, Hiredate 
from Emp order By sal desc;

select Empno, Ename, job, sal, Hiredate 
from Emp order By Job, Ename;

select Empno, Ename, job, sal, Hiredate 
from Emp order By Job, Ename DESC;
