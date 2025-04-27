
import java.util.Scanner;



public class Q_1reverse{
  public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reverseWord="";

        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord+=word.charAt(i);
        }
        System.out.print(reverseWord);

        scanner.close();

  }
}