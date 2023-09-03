import java.util.Scanner;

/** Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task_006HA {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    getFloatNumber();
  }

  public static float getFloatNumber() {
    float num = 0f;
    boolean validInput = true;

    while (validInput) {
      System.out.print("Введите дробное число: ");
      if (scanner.hasNextFloat()) {
        num = scanner.nextFloat();
        validInput = false;
        System.out.println("Введено число: " + num);
      } else {
        System.out.println("Ошибка. Введите дробное число");
        scanner.next();
      }
    }
    return num;
  }
}
