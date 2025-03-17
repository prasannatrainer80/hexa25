use hexamarch;

drop table if exists menu;

drop table if exists restaurant;

create table restaurant
(
	restaurantId INT Primary Key Auto_Increment,
    restaurantName varchar(30),
    Email varchar(30),
    Branch varchar(30)
);

create table Menu
(
   menuId INT Primary Key Auto_Increment,
   ItemName varchar(30),
   Price numeric(9,2),
   itemType varchar(10),
   restaurantId INT REFERENCES Restaurant(RestaurantId) 
);

insert into restaurant(restaurantName,email,branch) 
values('Mehfil','mehfil@gmail.com','Hitech City'),
	  ('Paradise','paradise@gmail.com','Paradise'),
      ('Swathi','swathi@gmail.com','Guindy'),
      ('Chutneys','chutneys@gmail.com','ASRAO');
      
insert into Menu(ItemName,price,ItemType,RestaurantId) 
values('Veg Biryani',273,'VEG',1),
      ('Roti',44,'VEG',1),
      ('Chicken Biryani',888,'NON-VEG',2),
      ('Chicken Fried Rings',772,'NON-VEG',1),
      ('Paneer Biryani',533,'VEG',1),
      ('Parata',220,'VEG',3),
      ('Dosa',111,'VEG',3),
      ('Ghee Dosa',180,'VEG',3);