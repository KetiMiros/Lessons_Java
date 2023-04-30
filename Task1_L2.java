/*
 * Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
package Lesson_2;

public class Task1_L2 {
    public static String stringC1C2toN(int n, char c1, char c2) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if  (i % 2 == 0) {
                str.append(c1);
            }
            else {
                str.append(c2);
            }
            
        }
    return str.toString();
    }
}
