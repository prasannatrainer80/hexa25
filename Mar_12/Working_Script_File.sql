drop database if exists hexamarch;

create database hexamarch;

use hexamarch;

create table dept(
  deptno int,
  dname  varchar(14),
  loc    varchar(13),
  constraint pk_dept primary key (deptno)
);


create table emp(
  empno    int,
  ename    varchar(10),
  job      varchar(9),
  mgr      int,
  hiredate date,
  sal      int,
  comm     int,
  deptno   int,
  constraint pk_emp_ENO primary key (empno),
  constraint fk_EMP_deptno foreign key (deptno) references dept (deptno)
);

/*
create table bonus(
  ename varchar2(10),
  job   varchar2(9),
  sal   int,
  comm  int
);
create table salgrade(
  grade int,
  losal int,
  hisal int
);
*/

insert into dept
values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept
values(20, 'RESEARCH', 'DALLAS');
insert into dept
values(30, 'SALES', 'CHICAGO');
insert into dept
values(40, 'OPERATIONS', 'BOSTON');

insert into emp
values(
 7839, 'KING', 'PRESIDENT', null,
 '1981-11-17',
 5000, null, 10
);
insert into emp
values(
 7698, 'BLAKE', 'MANAGER', 7839,
 '1981-1-5',
 2850, null, 30
);
insert into emp
values(
 7782, 'CLARK', 'MANAGER', 7839,
 '1981-9-6',
 2450, null, 10
);
insert into emp
values(
 7566, 'JONES', 'MANAGER', 7839,
 '1981-2-4',
 2975, null, 20
);
insert into emp
values(
 7788, 'SCOTT', 'ANALYST', 7566,
 '1987-08-12',
 3000, null, 20
);
insert into emp
values(
 7902, 'FORD', 'ANALYST', 7566,
 '1981-3-12',
 3000, null, 20
);
insert into emp
values(
 7369, 'SMITH', 'CLERK', 7902,
 '1980-12-17',
 800, null, 20
);
insert into emp
values(
 7499, 'ALLEN', 'SALESMAN', 7698,
 '1981-02-20',
 1600, 300, 30
);
insert into emp
values(
 7521, 'WARD', 'SALESMAN', 7698,
 '1981-2-22',
 1250, 500, 30
);
insert into emp
values(
 7654, 'MARTIN', 'SALESMAN', 7698,
 '1981-8-29',
 1250, 1400, 30
);
insert into emp
values(
 7844, 'TURNER', 'SALESMAN', 7698,
 '1981-8-9',
 1500, 0, 30
);
insert into emp
values(
 7876, 'ADAMS', 'CLERK', 7788,
 '1987-07-09',
 1100, null, 20
);
insert into emp
values(
 7900, 'JAMES', 'CLERK', 7698,
 '1981-3-12',
 950, null, 30
);
insert into emp
values(
 7934, 'MILLER', 'CLERK', 7782,
 '1982-2-15',
 1300, null, 10
);