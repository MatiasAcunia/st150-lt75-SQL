/*
 * Striver 150 #003: Find missing number
 * Tema: Arrays / Linear Scan and State Tracking
 * Enunciado original: https://takeuforward.org/practice/dsa/find-missing-number
 * Resumen orientativo: Analizar ocurrencias, elementos ausentes o frecuencias en los datos.
 * Lee el enunciado original para entradas, salidas y casos limite.
 * Tu solucion va debajo; esta plantilla NO representa un problema resuelto.
 */

class Solution {
    public int missingNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;
        for(int i = 0; i < nums.length; i++){
            suma += nums[i];
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        int sum2 = sumar(min, max);
        int tot = sum2 - suma;

        if (tot != 0) return tot;

        if(min > 0) return 0;

        return max + 1;

    }

    public int sumar(int min, int max){
        int suma = 0;
        for (int i = min; i <= max; i++){
            suma+= i;
        }
        return suma;
    }
}
