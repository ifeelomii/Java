import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    // Variable Decleration
    String s1, s2;
    boolean flag;

    Scanner sc = new Scanner(System.in);
    // Input
    System.out.println("Enter first string");
    s1 = sc.nextLine();
    System.out.println("Enter second string");
    s2 = sc.nextLine();

    // Processing

    char[] ch1 = new char[s1.length()];
    char[] ch2 = new char[s2.length()];
    ch1 = s1.toCharArray();
    ch2 = s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    flag = Arrays.equals(ch1, ch2);

    if (flag) {
      System.out.println("String is Anagramic String:");
    } else {
      System.out.println("String is not Anagramic string:");
    }
    sc.close();
  }
}