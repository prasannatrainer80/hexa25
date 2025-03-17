-- Apply Inner Join in 3 tables courses

select C.CCode,C.name,C.Fee, F.Faccode,F.Name,F.Qual
from Courses C INNER JOIN Course_Faculty CF 
ON C.CCODE = CF.CCode
INNER JOIN Faculty F ON F.Faccode = CF.Faccode;

-- Apply Left-Outer Join on above tables 

select C.CCode,C.name,C.Fee, F.Faccode,F.Name,F.Qual
from Courses C LEFT JOIN Course_Faculty CF 
ON C.CCODE = CF.CCode
LEFT JOIN Faculty F ON F.Faccode = CF.Faccode;

-- Apply Right-Join on above tables

select C.CCode,C.name,C.Fee, F.Faccode,F.Name,F.Qual
from Courses C RIGHT JOIN Course_Faculty CF 
ON C.CCODE = CF.CCode
RIGHT JOIN Faculty F ON F.Faccode = CF.Faccode;
