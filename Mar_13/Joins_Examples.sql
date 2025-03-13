-- what is common field between DEPT and EMP tables 

-- The synax for join is select field(s) from tables from Parent_Table Alias INNER Join
-- Child_Table Alias on Parent_table Alias primary key = child_table alias foreign key

-- the below query Deptno is primary key in DEPT table and Foreign key in Emp table 

select D.Deptno,Dname,Empno,Ename,job,Sal,Hiredate
from DEPT D INNER JOIN EMP E
ON D.Deptno = E.Deptno;

-- How to join more than 2 tables

select A.AgentId,FirstName,LastName,SSN,P.PolicyId,Appnumber,ModalPremium,
AnnualPremium
from Agent A INNER JOIN AgentPolicy AP 
ON A.AgentID = Ap.AgentID 
INNER JOIN Policy P ON P.PolicyID = AP.PolicyID;

-- Outer Join : 

-- LEFT JOIN : All records from the left side table and matching records from 
-- the right side table, if any child table records are not there it replaces with NULL

-- Right JOIN : All records from right-side table, and matching records from 
-- left side table. 

select D.Deptno,Dname,Empno,Ename,job,Sal,Hiredate
from DEPT D LEFT JOIN EMP E
ON D.Deptno = E.Deptno;

select D.Deptno,Dname,Empno,Ename,job,Sal,Hiredate
from DEPT D RIGHT JOIN EMP E
ON D.Deptno = E.Deptno;

select A.AgentId,FirstName,LastName,SSN,P.PolicyId,Appnumber,ModalPremium,
AnnualPremium
from Agent A LEFT JOIN AgentPolicy AP 
ON A.AgentID = Ap.AgentID 
LEFT JOIN Policy P ON P.PolicyID = AP.PolicyID;

select A.AgentId,FirstName,LastName,SSN,P.PolicyId,Appnumber,ModalPremium,
AnnualPremium
from Agent A RIGHT JOIN AgentPolicy AP 
ON A.AgentID = Ap.AgentID 
RIGHT JOIN Policy P ON P.PolicyID = AP.PolicyID;

-- Cross Join : Generates cartiacian product of given tables, as Table A contains n 
-- records and Table B contains m records then it generates (n * m) records 

select * from Dept Cross Join Emp;

-- self join : If a table joins with itself known as Self join 

select * from Emp;

select E1.Empno 'Manager Id', 
	E1.Ename 'Manager Name', 
    E2.Empno 'Employee Id', 
    E2.Ename 'Employee Name' 
from Emp E1 INNER JOIN Emp E2 
ON E1.Empno = E2.Mgr 
order By E1.empno;


select E1.Empno 'Manager Id', 
	E1.Ename 'Manager Name', 
    E2.Empno 'Employee Id', 
    E2.Ename 'Employee Name' 
from Emp E1 RIGHT JOIN Emp E2 
ON E1.Empno = E2.Mgr 
order By E1.empno;


