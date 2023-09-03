import java.util.Random;

public class Task_0004 {

  static Random random = new Random();

  public static void main(String[] args) {
    task4();
  }

  /** Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только 
с квадратными массивами
(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее 
сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим.*/

  static void task4() {
    for (int i = 0; i < 5; i++) {
      System.out.printf("\n***Итерация %d***\n\n", i + 1);
      int errCode = processArrayV2(genereteArray());
      if(errCode == -1){
        System.out.println("некорректная размерность массива");
      }
      else if (errCode == -2){
        System.out.println("Некорретное значение массива");
      }
      else{
        System.out.printf("Сумма элементов массива: %d\n", errCode);
      }
    }
  }

  static int[][] genereteArray() {
    int[][] arr = new int[random.nextInt(2) + 4][5];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = random.nextInt(2);
        if (random.nextInt(100) == 0) {
          arr[i][j] = 2;
        }
        System.out.printf("%d", arr[i][j]);
      }
      System.out.println();
    }
    return arr;
  }

  static int processArrayV2(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length != arr.length) {
        return -1;
      }
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] != 1 && arr[i][j] != 0) {
          return -2;
        } else {
          sum = arr[i][j];
        }
      }
    }
    return sum;
  }
}
