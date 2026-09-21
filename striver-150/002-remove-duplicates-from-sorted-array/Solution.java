/*
 * Striver 150 #002: Remove duplicates from sorted array
 * Tema: Arrays / Linear Scan and State Tracking
 * Enunciado original: https://takeuforward.org/practice/dsa/remove-duplicates-from-sorted-array
 * Resumen orientativo: Ordenar, seleccionar o mantener información de prioridad según el objetivo.
 * Lee el enunciado original para entradas, salidas y casos limite.
 * Tu solucion va debajo; esta plantilla NO representa un problema resuelto.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i ++){
           
            if (nums[j] != nums[i]){
                j++;

                nums[j] = nums[i]; 
                
            }
        }
        
        return j + 1;
    }
}