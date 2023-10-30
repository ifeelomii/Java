import java.util.Scanner;

class MenuDriven {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 1;
    do {
      MenuFunctions.MenuDisplay();
      System.out.println("Enter your choice: ");
      int ch = sc.nextInt();

      switch (ch) {
        case 1:
          {
            MenuFunctions.PrintTables();
            break;
          }
        case 2:
          {
            MenuFunctions.CheckPrime();
            break;
          }
        case 3:
          {
            MenuFunctions.PrintPattern();
            break;
          }
        case 0:
          {
            System.exit(0);
            break;
          }

        default:
          {
            System.out.println("Enter Correct Choice:");
            break;
          }
      }
      System.out.println("Enter 1. to continue");
      System.out.println("Enter 0. to exit");
      n = sc.nextInt();
    } while (n != 0);

    sc.close();
  }
}