DROP TABLE IF EXISTS `students`;

CREATE TABLE students(
student_id INT UNSIGNED NOT NULL PRIMARY KEY,
name VARCHAR(30)DEFAULT NULL,
mobile VARCHAR (15) DEFAULT NULL
);

INSERT INTO students VALUES (1, 'Usama Khurshid', '0316-9172434');
INSERT INTO students VALUES (2, 'Bilal Azhar',    '0316-9177894');
INSERT INTO students VALUES (3, 'Yaseen Masood',  '0316-9456434');
INSERT INTO students VALUES (4, 'Usman Masood',   '0316-9185234');
INSERT INTO students VALUES (5, 'Haris Azhar',    '0316-9174134');