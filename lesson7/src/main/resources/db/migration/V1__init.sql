BEGIN;
SET search_path TO hiber,public;
DROP TABLE IF EXISTS students CASCADE;
CREATE TABLE students (id bigserial PRIMARY KEY, name VARCHAR(255), age integer);
INSERT INTO students (name, age) VALUES
('Ivanov', 17),
('Semenov', 19),
('Vasechkin', 20),
('Petrov', 18),
('Popov', 19),
('Sidorov', 21);
COMMIT;