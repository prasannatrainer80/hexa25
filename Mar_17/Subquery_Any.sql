-- Display matching records from Agent and AgentPolicy tables (means agentid exists in both tables)

select * from Agent where agentid = ANY(select agentId from agentPolicy);

-- Display matching records from Policy and AgentPolicy tables(means policyId exists in both tables)

select * from Policy where policyId = ANY(select policyId from AgentPolicy); 

-- Display matching records from Course and CourseFaculty (mean ccode exists in both tables) 

select * from courses where ccode = ANY(select ccode from course_faculty); 

-- Display matching records from Faculty and CourseFaculty(means faccode exists in both tables) 

select * from faculty where FACCODE = ANY(select faccode from Course_faculty);