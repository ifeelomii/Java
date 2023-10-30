import java.util.Scanner;

public class MenuFunctions {

  public static void MenuDisplay() {
    System.out.println("Enter 1. To Print Table");
    System.out.println("Enter 2. To Check Prime Number");
    // System.out.println("Enter 3. To Display Pattern");
    System.out.println("Enter 0. To Exit");
  }

  public static void PrintTables() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " x " + num + " = " + (i * num));
    }
  }

  public static void CheckPrime() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = sc.nextInt();
    int s=0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        s = 0;
        break;
      } else {
        s = 1;
      }
    }

    if (s != 0) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Not Prime Number");
    }
  }

  public static void PrintPattern() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter odd number between 0-9");
    int n = sc.nextInt();
    int i, j;

    for (i = 0; i < n; i++) {
      for (j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      for (j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (i = n - 1; i > 0; i--) {
      for (j = 1; j <= n - i; j++) {
        System.out.println(" ");
      }
      for (j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
