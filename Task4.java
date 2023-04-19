/*   * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
     * например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет. */

package Lessons_Java;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите выражение вида 5? + ?5 = 60. Можете ставить вопросы в любых местах -> ");
        Scanner iScanner = new Scanner(System.in);
        String equation = iScanner.nextLine();             // Принимаем значение от пользователя
        String[] parts = equation.split(" ");        // разбиваем его по пробелам и заносим в массив
        String q = parts[0];                               // достаем и записываем в переменные значения каждого слагаемого
        String w = parts[2];
        String e = parts[4];
/* создаем флаг для определения, решение существует или нет, вывод будет в цикле
 * // перебираем все возможные вариации чисел, чисел у нас их
  // всего 10, от 0 до 9. Итого три цикла, по одному на каждое возможное неизвестное. Неизвестным считается
  // вопрос и вместо него нужно поставить правильное число. Один знак это char можно заменить функцией
  // replace.Подставляем цифры и смотрим когда решение станет верным.
  // (char)
 */
        String result = "";                               // вывод
        boolean foundSolution = false;      
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String q1 = q.replace('?', (char) ('0' + i));
                    String w1 = w.replace('?', (char) ('0' + j));
                    String e1 = e.replace('?', (char) ('0' + k));
                    // после каждой итерации проверяется условие, еси оно верно записывается значение в переменную и
                    // флаг меняется на true
                    if (Integer.parseInt(q1) + Integer.parseInt(w1) == Integer.parseInt(e1)) {
                        result = q1 + " + " + w1 + " = " + e1 + "\n";
                        foundSolution = true;
                    }
                }
            }
        }

        if (!foundSolution) {
            result += "Решения нет";
        }
        else{
            System.out.println(result);
        }



    }
    }

    
