--You have two SQL tables! The first one is called employees and it contains
--the employee names, the unique employee ids and the department names of
--a company.
--Sample:
--department_name    employee_id    employee_name
--Sales              123            John Doe
--Sales              211            Jane Smith
--HR                 556            Billy Bob
--Sales              711            Robert Hayek
--Marketing          235            Edward Jorgson
--Marketing          236            Christine Packard
--...                ...            ...
--
--The second one is named salaries. It holds the same employee names
--and the same employee ids - and the salaries for each employee.
--Sample:
--salary     employee_id    employee_name
--500        123            John Doe
--600        211            Jane Smith
--1000       556            Billy Bob
--400        711            Robert Hayek
--1200       235            Edward Jorgson
--200        236            Christine Packard
--...        ...            ...
--The company has 546 employees, so both tables have 546 rows.
--Print every department where the average salary per employee is lower than $500!

SELECT
e.department_name
FROM
salaries AS s
JOIN employees AS e
ON s.employee_id = e.id
HAVING AVG(s.salary) < 500;
