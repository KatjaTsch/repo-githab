import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystemException;

public class Task_0014 {

  public static void main(String[] args) {
    try {
      makeRecord();
      System.out.println("success");
    } catch (FileSystemException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getStackTrace());
    }
  }

  public static void makeRecord() throws Exception {
    System.out.println(
      "Введите фамилию, имя, отчество, номертелефона через пробел"
    );

    String text;
    try (
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))
    ) {
      text = bf.readLine();
    } catch (IOException e) {
      throw new Exception("Произошла ошибка при работе с консолью");
    }

    String[] array = text.split(" ");
    if (array.length != 4) {
      throw new Exception("Введено неверное количество параметров");
    }

    String nXame = array[0];
    String surname = array[1];
    String patronymic = array[2];

    int phone;
    try {
      phone = Integer.parseInt(array[3]);
    } catch (NumberFormatException e) {
      throw new NumberFormatException("Неверный формат номера");
    }
  }
}
