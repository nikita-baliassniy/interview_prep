USE cinema;
SELECT F.name, 
		SUM(T.quantity) AS clients,
		SUM(T.quantity * T.price) AS profit
FROM cinema.ticket T JOIN cinema.film F ON T.film_id = F.id 
GROUP BY F.name WITH ROLLUP
ORDER BY profit