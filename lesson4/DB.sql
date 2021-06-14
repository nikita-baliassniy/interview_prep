CREATE DATABASE `cinema` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `film` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `duration` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `hall` (
  `id` int NOT NULL AUTO_INCREMENT,
  `color` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `ticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `film_id` int NOT NULL,
  `start_time` datetime NOT NULL,
  `hall_id` int NOT NULL,
  `price` decimal(5,0) NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ticket_film_idx` (`film_id`),
  KEY `ticket_hall_idx` (`hall_id`),
  CONSTRAINT `ticket_film` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ticket_hall` FOREIGN KEY (`hall_id`) REFERENCES `hall` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
