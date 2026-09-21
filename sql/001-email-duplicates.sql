-- SQL Practice Set #001: Email Duplicates
-- Enunciado original: https://takeuforward.org/practice/sql/email-duplicates
-- Resumen orientativo: elaborar la consulta solicitada en «Email Duplicates».
-- Consultar en el enlace las tablas, columnas, restricciones y dialecto SQL.
-- Esta plantilla NO representa un ejercicio resuelto.

-- TODO: write your own SQL query here.

SELECT DISTINCT P.email
FROM Person AS P
WHERE P.email IN (
    SELECT P2.email
    FROM Person AS P2
    WHERE P2.id <> P.id
);
