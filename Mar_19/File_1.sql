select * from Agent;

update Agent set FullName=concat(firstName,' ',mi,' ',lastname);

select * from Agent;

-- change the address1 of AgentID 1 to '4 Avenue' of Agent table

update agent set address1='4th Avenue' where AgentID=1;

-- change the maritalstatus to 1, address1 as 'Dabagardens',
-- city as 'vizag', state as 'ap' for agentId 3

Update Agent Set MaritalStatus=1, address1='Dabagardens',city='vizag',
state='ap' where AgentID=3;

-- change MaritalStatus as 1, Address1 = 'Near LIC Office',Address2='Guindy'
-- city='Chennai' state='TN' for AgentId=7

update Agent set MaritalStatus=1, Address1='Near Lic Office',
Address2='Guindy',city='Chennai', State='TN' WHERE AgentID=7;

select * from Policy;

-- modify AnnulaPremium to 100000, paymentModeId to 3, ModalPremium as 25000 for policyId=1

Update Policy Set AnnualPremium=100000, PaymentModeId=3, 
ModalPremium=25000 Where PolicyId=1;

-- Delete command : Used to delete all records or particular records from the table

-- delete from table_name where condition

delete from employ where empno=5;

