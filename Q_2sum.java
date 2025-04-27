

import java.util.Scanner;

public class Q_2sum {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      String numberStr = String.valueOf(number);
      int sum = 0;

      
      for (int i = 0; i < numberStr.length(); i++) {
          sum += Character.getNumericValue(numberStr.charAt(i));
      }

      System.out.println( sum);
  }
}
