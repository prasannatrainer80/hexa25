drop database if exists Exam;

Create Database Exam;

use Exam;

Create Table Agent
(
  AgentID INT primary key,
  Name varchar(30),
  City varchar(30),
  GENDER ENUM('MALE','FEMALE'),
  MaritalStatus INT,
  Premium numeric(9,2)
);

Insert into Agent(AgentId,Name,City,Gender,
MaritalStatus,Premium) 
values(1,'Aman','Delhi','MALE',0,56654.44),
(2,'Sougata','Kolkata','MALE',1,56643.33),
(3,'Sarbani','Kolkata','FEMALE',0,66433.55),
(4,'Chandana','Hyderabad','FEMALE',0,66334.44);