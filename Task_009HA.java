import java.util.Scanner;

/**Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

public class Task_009HA {

  

  public static void main(String[] args) {
    emptyString();
  }

  static void emptyString() {
    Scanner scanner = new Scanner(System.in);
    try {System.out.println("введите строку");
    String str = scanner.nextLine();

    if (str.isEmpty()) {
      throw new Exception("Пустые строки вводить нельзя");
    }
    System.out.println("Введено: " + str);
}
catch (Exception e){
    System.out.println(e.getMessage());
} finally{
    scanner.close();
}
  }
}
