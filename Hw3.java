package Lesson_2.hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Lesson_2.task.Log;

public class Hw3 {
    private static final Logger LOG = Log.log(Hw3.class.getName());
    public static void calcWithLog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите через пробел 2 числа и оператор:");
        System.out.println("доступные операторы: *, /, +, -");
        System.out.println("Например 2 * 4");
        String digit1 = scanner.nextLine();
        String[] parts = digit1.replace(" ", "").split("");
        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b = Integer.parseInt(parts[2]); 
        //int a = Integer.parseInt(digit1);
        // String operator = scanner.next();
        // String digit2 = scanner.next();
        // int b = Integer.parseInt(digit2);
        scanner.close();
        Float result = null;
        switch (operator) {
            case "*": 
                result = (float) (a*b);
                System.out.println(result);
                break;
            case "/": 
                result = (float) (a/b);
                System.out.println(result);
                break;
            case "+": 
                result = (float) (a+b);
                System.out.println(a+b);
                break;
            case "-": 
                result = (float) (a-b);
                System.out.println(result);
                break;
            default: 
                //System.out.println("что-то пошло не так");
                LOG.log(Level.INFO , "что-то пошло не так");   // пишем в лог что не смогли вести расчет
                break;   
                
        }
        if (result != null){
            try (FileWriter in = new FileWriter("calc_log.txt")) {
                in.append(result.toString());  //пишем результат вычисления в файл если доступно
                LOG.log(Level.INFO , "normally clculated  and recorded");  // в лог запишет если всё прошло нормально  
            }
            catch (IOException e) {
                LOG.log(Level.INFO , e.getMessage());   //или выдаст ошибку в лог-файл если не смог записать
                throw new RuntimeException(e);
            }
        }
    }
}



/*
 * после команды String digit1 = scanner.next(); в памяти будет сохранено выражение типа 2 + 2
можно было разбить его при помощи методов String: String[] parts = digit1.replase(" ", "").split("");
тогда int num1 = parts[0], String operator = part[1] ну итд
 */
