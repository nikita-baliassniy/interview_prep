USE cinema;
DROP VIEW SCHEDULE;
CREATE VIEW SCHEDULE AS (
SELECT T.film_id AS id, 
		T.id AS ticket_id, 
		F.name AS film, 
        F.duration AS duration, 
        T.start_time AS beginning, 
        date_add(T.start_time, INTERVAL F.duration MINUTE) AS ending, 
        H.color AS hall
FROM cinema.ticket T JOIN cinema.film F ON T.film_id = F.id 
					JOIN cinema.hall H ON T.hall_id = H.id)
