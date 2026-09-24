/*
 * Striver 150 #004: Majority Element-I
 * Tema: Arrays / Linear Scan and State Tracking
 * Enunciado original: https://takeuforward.org/practice/dsa/majority-element-i
 * Resumen orientativo: Resolver «Majority Element-I» siguiendo el enunciado y sus restricciones originales.
 * Lee el enunciado original para entradas, salidas y casos limite.
 * Tu solucion va debajo; esta plantilla NO representa un problema resuelto.
 */

class Solution {
public int majorityElement(int[] nums) {

       int count = 1;
       int candidate = nums[0];

       for (int i = 1; i < nums.length; i++){


        if (candidate == nums[i]){

            count++;

        } else{

            count--;

            if (count == 0){

                candidate = nums[i];
                count = 1;

            }
        
        }
       }
        return candidate;
    }
}
