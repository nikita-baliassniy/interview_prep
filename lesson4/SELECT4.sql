USE cinema;
SELECT SUM(T.quantity) AS clients,
		SUM(T.quantity * T.price) AS profit,
        EXTRACT(HOUR FROM T.start_time) DIV 3 AS time_group
FROM cinema.ticket T
GROUP BY time_group
ORDER BY time_group