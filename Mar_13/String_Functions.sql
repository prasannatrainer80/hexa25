-- String Functions 

-- instr() : Used to display the first occurrence of given char in a string 

select instr('hello','l');

-- length() : Used to display length of string 

select length('Anusri');

select ename,length(ename) from Emp;

select FirstName, length(FirstName) from Agent;

-- reverse() : Used to display string in reverse order 

select reverse('Prafulla');

select firstName, reverse(firstName) from Agent;

-- lower() : Lower Case
-- Upper() : Upper Case

select lower('BhagyaSree');
select upper('BhagyaSree');

select concat('Anu',' varshini');

-- replace() : Used to replace old word/char with new word or char in all occurrences

select replace('Java Training','Java','Sql');
