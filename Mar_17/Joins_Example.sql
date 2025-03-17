-- Apply join betwen Restaurant and Menu tables 

Select R.restaurantId,restaurantName,ItemName,Price,ItemType
from Restaurant R INNER JOIN Menu M 
ON R.restaurantId = M.restaurantId;

-- Apply LEFT-OUTER Join on above table(s) 

Select R.restaurantId,restaurantName,ItemName,Price,ItemType
from Restaurant R LEFT JOIN Menu M 
ON R.restaurantId = M.restaurantId;

Select R.restaurantId,restaurantName,ItemName,Price,ItemType
from Restaurant R RIGHT JOIN Menu M 
ON R.restaurantId = M.restaurantId;


