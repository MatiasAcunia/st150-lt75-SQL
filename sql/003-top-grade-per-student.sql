-- SQL Practice Set #003: Top Grade per Student
-- Enunciado original: https://takeuforward.org/practice/sql/top-grade-per-student
-- Resumen orientativo: elaborar la consulta solicitada en «Top Grade per Student».
-- Consultar en el enlace las tablas, columnas, restricciones y dialecto SQL.
-- Esta plantilla NO representa un ejercicio resuelto.

-- TODO: write your own SQL query here.

SELECT E.student_id, MIN(E.course_id) AS course_id, E.grade
FROM Enrollments AS E
WHERE (E.student_id, E.grade) IN(
    SELECT E2.student_id, MAX(E2.grade)
    FROM Enrollments AS E2
    GROUP BY E2.student_id
)
GROUP BY E.student_id, E.grade
ORDER BY E.student_id;

