USE cinema;
SELECT S1.film, 
		S1.beginning, 
		S1.duration, 
        S2.film, 
        S2.beginning, 
        S2.duration
FROM SCHEDULE S1 JOIN SCHEDULE S2 ON S1.beginning < S2.ending 
	AND S1.ending > S2.beginning 
	AND S1.ticket_id != S2.ticket_id 
	AND S1.hall = S2.hall 
ORDER BY S1.beginning