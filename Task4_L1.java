//  Вывести все простые числа от 1 до 1000.
package Lessons_Java;


public class Task4_L1 {
  public static void main(String[] args) {
    for (int i = 2; i <= 1000; i++) {                       //Первый цикл для перебора самих чисел
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {                   //второй цикл для перебора делителей
                if (i % j == 0) {                          //Если число делится на делитель без остатка
                    isPrime = false;
                    break;  
                }
            }
            if (isPrime) System.out.print("(" + i + ")" + " ");
        }
    }
  
 }
  


   