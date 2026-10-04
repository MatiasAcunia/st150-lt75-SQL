-- SQL Practice Set #007: Query Quality Analysis
-- Enunciado original: https://takeuforward.org/practice/sql/query-quality-analysis
-- Resumen orientativo: elaborar la consulta solicitada en «Query Quality Analysis».
-- Consultar en el enlace las tablas, columnas, restricciones y dialecto SQL.
-- Esta plantilla NO representa un ejercicio resuelto.

-- TODO: write your own SQL query here.

SELECT Q.query_name, ROUND(AVG(Q.rating / Q.position), 2) AS quality,ROUND(AVG(Q.rating < 3) * 100, 2) AS poor_query_percentage
FROM Queries as Q
GROUP BY Q.query_name
WHERE Q.query_name IS NOT NULL
