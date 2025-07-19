# Write your MySQL query statement below
select 'Low Salary' as category,count(if(income<20000,1,null)) as accounts_count 
from accounts
union all
select 'Average Salary',count(if(income>=20000 and income<=50000,1,null)) 
from accounts
union all
select 'High Salary',count(if(income>50000,1,null)) from accounts