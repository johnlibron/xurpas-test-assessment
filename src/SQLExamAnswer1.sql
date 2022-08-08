--Let's say you have two SQL tables: authors and books.
--The authors dataset has 1M+ rows; here's the first six rows:
--author_name      book_name
--author_1         book_1
--author_1         book_2
--author_2         book_3
--author_2         book_4
--author_2         book_5
--author_3         book_6
--...              ...
--
--The books dataset also has 1M+ rows and here's the first six:
--book_name      sold_copies
--book_1         1000
--book_2         1500
--book_3         34000
--book_4         29000
--book_5         40000
--book_6         4400
--...            ...
--
--Create an SQL query that shows the TOP 3 authors who sold the most books in total

SELECT DISTINCT
a.author_name
FROM
authors AS a
INNER JOIN books AS b
ON a.book_id = b.id

ORDER BY b.sold_copies DESC
LIMIT 3;