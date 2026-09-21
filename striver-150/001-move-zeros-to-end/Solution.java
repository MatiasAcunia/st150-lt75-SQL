/*
 * Striver 150 #001: Move Zeros to End
 * Tema: Arrays / Linear Scan and State Tracking
 * Enunciado original: https://takeuforward.org/practice/dsa/move-zeros-to-end
 * Resumen orientativo: Resolver «Move Zeros to End» siguiendo el enunciado y sus restricciones originales.
 * Lee el enunciado original para entradas, salidas y casos limite.
 * Tu solucion va debajo; esta plantilla NO representa un problema resuelto.
 */

class Solution {
   public void moveZeroes(int[] nums) {
        int j = 0; //j siendo puntero

        for (int i = 1; i < nums.length; i++){

            if (nums[j] == 0 && nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }else if(nums[j] != 0){
                j++;
            }

        }   
    }
    
}
