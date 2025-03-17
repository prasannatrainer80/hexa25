select * from Emp;

select max(sal) from Emp;

-- Display name of employ who is getting max. salary 

select ename from emp where sal=(select max(sal) from Emp);

-- Display 2nd max. salary 

select max(sal) from Emp where sal < (select max(sal) from Emp); 

-- Display name of employee who is getting 2nd max salary 

select ename from emp where sal = (
select max(sal) from Emp where sal < (select max(sal) from Emp)
);

