/*
 * Striver 150 #005: Kadane's Algorithm
 * Tema: Arrays / Linear Scan and State Tracking
 * Enunciado original: https://takeuforward.org/practice/dsa/kadane's-algorithm
 * Resumen orientativo: Resolver «Kadane's Algorithm» siguiendo el enunciado y sus restricciones originales.
 * Lee el enunciado original para entradas, salidas y casos limite.
 * Tu solucion va debajo; esta plantilla NO representa un problema resuelto.
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int mejorSuma = Integer.MIN_VALUE;

        int sumaActual = 0;

        for(int i = 0; i < nums.length; i++){

            sumaActual+= nums[i];

            if (sumaActual > mejorSuma) mejorSuma = sumaActual;

            if (sumaActual < 0) sumaActual = 0;
        }

        return mejorSuma;
    }
}