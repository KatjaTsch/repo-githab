import java.util.Random;

public class Task_0003 {

  static Random random = new Random();

  public static void main(String[] args) {
    task3();
  }

  /**
   * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
   * Необходимо посчитать и вернуть сумму элементов этого массива.
   * При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
   * (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
   * Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
   */

  static void task3() {
    for (int i = 0; i < 5; i++) {
      System.out.printf("\n***Итерация %d***\n\n", i + 1);
      processArray(genereteArray());
    }
  }

  static void processArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr.length != arr[i].length) {
        throw new RuntimeException("некорректная размерность массива");
      }
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] != 0 && arr[i][j] != 1) {
          throw new RuntimeException(
            String.format(
              "Некорректное значение массива по индексу [%d][%d]",
              i,
              j
            )
          );
        } else {
          sum += arr[i][j];
        }
      }
    }
    System.out.printf("Сумма элементов массива: %d\n", sum);
  }

  static int[][] genereteArray() {
    int[][] arr = new int[random.nextInt(2) + 4][5];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = random.nextInt(2);
        if (random.nextInt(1000) == 0) {
          arr[i][j] = 2;
        }
        System.out.printf("%d", arr[i][j]);
      }
      System.out.println();
    }
    return arr;
  }
}
