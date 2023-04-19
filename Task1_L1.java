// Создать простой калькулятор

package Lessons_Java;

import java.util.Scanner;

public class Task1_L1 {
  public static void main(String[] args) {
    try (Scanner myScan = new Scanner(System.in)) {
			System.out.print("Введите число x: ");
			int num_x = myScan.nextInt(); // сообщаем, что принимаем число

			System.out.print("Введите число y: ");
			int num_y = myScan.nextInt();

			int res;
// загуглила, что нужно так сделать ,но это костыли по выводу-строки №19,20
			System.out.print("Выберите действие: ");
			String action = myScan.nextLine();
			action = myScan.nextLine();

			switch (action) {
			  case "+":
			    res = num_x + num_y;
			    System.out.println("Результат:" + res);
			    break;
			  case "-":
			    res = num_x - num_y;
			    System.out.println("Результат:" + res);
			    break;
			  case "/":
			    if (num_y == 0) // страхуемся от деления на ноль
			      System.out.println("Error");
			    else {
			      res = num_x / num_y;
			      System.out.println("Результат:" + res);
			      break;
			    }
			  case "*":
			    res = num_x * num_y;
			    System.out.println("Результат:" + res);
			    break;
			  default:
			    System.out.println("Вы что-то не то ввели, попробуйте еще раз");
			}
		}

  }
}
