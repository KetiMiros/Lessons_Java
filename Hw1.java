/*
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */
package Lesson_2.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import Lesson_2.Log;

public class Hw1 {
    public static int[] getIntArray(int l) {
        //int l = 10; //хардкодим только длину
        int[] array = new int[l];
        Random rand = new Random();
        for(int i = 0; i < l; i++){
            array[i] = rand.nextInt(10);
            //System.out.println(array[i]);
       }
       System.out.println(Arrays.toString(array));
       return array;
    }

    public static void sortByBubble(int[] arr) {
        final Logger LOG = Log.log(Hw1.class.getName());
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
 
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    LOG.log(Level.INFO , arr[i] + " меняем местами с " + arr[i+1]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
