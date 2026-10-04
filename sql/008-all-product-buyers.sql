-- SQL Practice Set #008: All-Product Buyers
-- Enunciado original: https://takeuforward.org/practice/sql/all-product-buyers
-- Resumen orientativo: elaborar la consulta solicitada en «All-Product Buyers».
-- Consultar en el enlace las tablas, columnas, restricciones y dialecto SQL.
-- Esta plantilla NO representa un ejercicio resuelto.

-- TODO: write your own SQL query here.

SELECT C.customer_id
FROM Customer as C, Product as P
GROUP BY C.customer_id
HAVING COUNT(DISTINCT C.product_key) = (
    SELECT COUNT(*)
    FROM Product
)