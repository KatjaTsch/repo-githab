public class Task_0001 {
    public static void main(String[] args) {
        System.out.printf("длина массива: %d\n", task1(new int[] { 1, 2, 3 }));
      }
    
      /**
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума, метод возвращает
    -1, в качестве кода ошибки, иначе - длину массива.
    */
    
      static int task1(int[] arr) {
        if (arr.length == 0) {
          return -1;
        }
        return arr.length;
      }
    }
    