-- SQL Practice Set #002: Match Employees With Their Salaries
-- Enunciado original: https://takeuforward.org/practice/sql/match-employees-with-their-salaries
-- Resumen orientativo: elaborar la consulta solicitada en «Match Employees With Their Salaries».
-- Consultar en el enlace las tablas, columnas, restricciones y dialecto SQL.
-- Esta plantilla NO representa un ejercicio resuelto.

-- TODO: write your own SQL query here.

SELECT
    e.employee_id,
    e.name,
    s.salary
FROM Employees e, Salaries s
WHERE e.employee_id = s.employee_id;