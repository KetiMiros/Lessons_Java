/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 *  который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
package Lesson_2;

import java.io.FileWriter;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Task2_L2 {
    public static void writeToFile() {
        String str = builgString();
        String str1 = builgString();
        System.out.println("Links:" + str1 == str);
        System.out.println("Strings:" + str1.equals(str));
        try (FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
            
    public static String builgString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
        }
    return builder.toString();
    //return "TEST".repeat(100); коротко и красиво
    }
}
