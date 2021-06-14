USE cinema;
SELECT S1.film, 
		S1.beginning, 
        S1.duration, 
        S2.film, 
        S2.beginning, 
        TIMESTAMPDIFF(MINUTE, S1.ending, S2.beginning) AS space, 
        S1.hall
FROM SCHEDULE S1 JOIN SCHEDULE S2 ON S1.ending < S2.beginning 
WHERE S1.hall = S2.hall 
		AND TIMESTAMPDIFF(MINUTE, S1.ending, S2.beginning) > 30
ORDER BY space DESC