import java.util.Random;
import java.util.Scanner;

public class Task_0002 {

  static Random random = new Random();
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    task2();
  }

  /** Реализуйте метод, принимающий в качестве аргумента целочисленный массив 
   * и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, 
в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
Напишите метод, в котором реализуйте взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый,
обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение: 
“Искомый элемент не найден”.*/

  static void task2() {
    while (true) {
      System.out.println("Укажите число для поиска:");
      if (scanner.hasNextInt()) {
        int searchNumber = scanner.nextInt();
        int[] arr = new int[random.nextInt(5) + 1];
        if (random.nextInt(2) == 0) {
          arr = null;
        } else {
          for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.printf("%d\t", arr[i]);
          }
          System.out.println();
        }
        int codeResult = processArray(arr, searchNumber);
        if (codeResult == -1) {
          System.out.println("Длина массива менее 3 элементов");
        } else if (codeResult == -2) {
          System.out.println("Элемент не найден");
        } else if (codeResult == -3) {
          System.out.println("Массив некорректно проинициализирован");
        } else {
          System.out.println("Массив успешно обработан");
          System.out.printf("Массив найден по индексу: %d", codeResult);
        }
        System.out.println();
      }
      else{
        System.out.println("Число для поиска некорректно.");
        scanner.nextLine();
      }     
    }
  }

  static int processArray(int[] arr, int searchNumber) {
    if (arr == null) {
      return -3;
    }
    if (arr.length < 3) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == searchNumber) {
        return i;
      }
    }
    return -2;
  }
}
