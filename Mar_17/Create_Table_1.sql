-- Create a table as 
-- Employ(empno+ INT,name varchar(20),gender (enum),dept varchar(15),
-- desig varchar(15), basic numeric) 

use hexamarch;

drop table if exists leaveHistory;

drop table if exists Employ;

create table Employ
(
    Empno INT Primary Key, 
    Name varchar(20),
    gender ENUM('MALE','FEMALE'),
    Dept varchar(15),
    Desig varchar(15),
    Basic Numeric(9,2)
);

-- Insert Records into Employ table 

Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic) 
values(1,'Bala','MALE','Java','Programmer',88234),
(2,'Dhana','FEMALE','Dotnet','Expert',88222),
(3,'Charuhasini','FEMALE','Java','Manager',88888),
(4,'Arya','FEMALE','Sql','Expert',99222),
(5,'Gopala','MALE','Java','Manager',98822),
(6,'Harsh','MALE','Sql','DBA',88822);

-- LeaveHistory(LeaveId+,Empno-,leaveStartDate,leaveEndDate,leaveReason) 

Create Table LeaveHistory
(
    leaveId INT auto_increment,
    Empno INT,
    leaveStartDate DateTime,
    leaveEndDate DateTime,
    leaveReason varchar(30),
    primary key(leaveId), 
    Foreign Key(Empno) REFERENCES Employ(Empno)
);

Insert into LeaveHistory(empno,LeaveStartDate,LeaveEndDate,LeaveReason)
values(1,'2025-12-12','2025-12-18','Going Home'),
(2,'2022-10-10','2022-10-18','Sick'),
(4,'2024-12-12','2024-12-18','Not Well'),
(5,'2025-10-10','2025-10-10','Exams');
