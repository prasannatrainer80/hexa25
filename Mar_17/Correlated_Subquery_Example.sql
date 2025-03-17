-- Correlated Subquery 

-- display nth max salary 

select sal from Emp E1 where 1-1 = (select count(distinct sal) from Emp e2 
WHERE E2.sal > E1.sal);

select distinct sal from Emp E1 where 2-1 = (select count(distinct sal) from Emp e2 
WHERE E2.sal > E1.sal);

select distinct sal from Emp E1 where 3-1 = (select count(distinct sal) from Emp e2 
WHERE E2.sal > E1.sal);

select distinct sal from Emp E1 where 4-1 = (select count(distinct sal) from Emp e2 
WHERE E2.sal > E1.sal);

