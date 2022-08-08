--You work for a startup that makes an online presentation software.
--You have an event log that records every time a user inserted an image into a presentation.
--(One user can insert multiple images.) The event_log SQL table looks like this:
--user_id      event_date_time
--7494212      1535308430
--7494212      1535308433
--1475185      1535308444
--6946725      1535308475
--6946725      1535308476
--6946725      1535308477
--...          ...
--...and it has over one billion rows.
--Note: If the event_date_time column's format doesn't look familiar, google "epoch timestamp"!
--Write an SQL query to find out how many users inserted more than 1000 but
--less than 2000 images in their presentations!

COUNT()

SELECT
u.name
FROM
users AS u
JOIN event_log AS e
ON u.id = e.user_id
GROUP BY u.name
HAVING COUNT(e.id) BETWEEN 1000 AND 2000;
