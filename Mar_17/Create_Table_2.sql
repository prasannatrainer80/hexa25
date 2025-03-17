-- Doctor(DoctorId,DoctorName,Speciality,Qualification,DateofBirth') 

-- DoctorId INT Auto_Increment
-- Speciality varchar(30),
-- Qualification varchar(30),
-- DateOfBirth Date 

use hexamarch;

drop table if exists Doctor;

create table Doctor
(
   DoctorId INT auto_increment,
   DoctorName varchar(30),
   Speciality varchar(30),
   Qualification varchar(30),
   DateOfBirth datetime,
   primary key(DoctorId)
);

Create Table Patient
(
    PatientId INT AUTO_INCREMENT,
    PatientName varchar(30),
    HealthProblem varchar(30),
    DoctorId INT,
    Comments varchar(30),
    primary Key(PatientID),
    foreign key(DoctorId) references Doctor(DoctorID)
);

Insert into Doctor(DoctorName,Speciality,Qualification,DateOfBirth)
values('Raheem','Bones','MBBS','1988-12-12'),
('AVRAO','General','MS','2000-12-25'),
('Susheel','Children','MBBS','1965-12-22'),
('Sai','Kidney','MS','1998-12-25'),
('Padmaja','Fertility','MS','1990-12-22');