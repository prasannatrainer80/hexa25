-- Display Idle agents (agentId exists in Agent table not in AgentPolicy Table) 

select * from Agent where agentID <> ALL(select agentId from AgentPolicy);

-- Display Idle Policies (PolicyId exists in Policy Table and not in AgentPolicy Table) 

select * from Policy where PolicyId <> ALL(select PolicyId from agentpolicy);

-- Display list of courses not registerd by any students (means ccode which is in Courses table,
-- but not in Course_Faculty table) 

select * from courses where ccode <> ALL(select CCODE from course_faculty); 

-- Display the Idle Faculties (Faccode which is there in Faculty table, but not in Course_Faculty)

select * from Faculty where Faccode <> ALL(select faccode from course_faculty);