-- curdate() : Used to display today's date

select curdate();

-- CurTime() : Used to display current time

select curtime();

-- dayofweek 

select dayofweek(curdate());

select quarter(curdate());

-- last_day() : Displays the last_day of hte month of date specified

select last_day(curdate());

-- adddate() : used to add no.of months/years/days to the current date 

select adddate(curdate(), INTERVAL 5 DAY);
select adddate(curdate(), INTERVAL 7 MONTH);
select adddate(curdate(), INTERVAL 3 YEAR);
