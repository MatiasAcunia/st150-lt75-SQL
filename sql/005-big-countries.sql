-- SQL Practice Set #005: Big Countries
-- Enunciado original: https://takeuforward.org/practice/sql/big-countries
-- Resumen orientativo: elaborar la consulta solicitada en «Big Countries».
-- Consultar en el enlace las tablas, columnas, restricciones y dialecto SQL.
-- Esta plantilla NO representa un ejercicio resuelto.

-- TODO: write your own SQL query here.

SELECT W.name, W.population, W.area
FROM World AS W
WHERE W.area >= 3000000
OR W.population >= 25000000;