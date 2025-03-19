-- Display List of records from Menu table 

select * from Menu;

-- display max price w.r.t. Restaurant wise in menu table 

select restaurantId, max(price) from menu group by restaurantId;

-- Display total items present in menu table w.r.t. Restaurant Wise 

select restaurantId, count(*) from Menu group by restaurantId;

-- Display all restaurant details for which menu items are present 

select * from restaurant where restaurantId = ANY(select restaurantId from Menu);

-- Display all restaraunt details for which menu items are not present 

select * from restaurant where restaurantId <> ALL(select restaurantId from Menu);