import java.util.Scanner;

public class ArrayOperations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      ArrayServices.ArrayMenu();
      System.out.println("Enter Your Choice");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          {
            System.out.println("Addition Array is: ");
            ArrayServices.ArrayAddition();
            break;
          }
        case 2:
          {
            System.out.println("Transpose Array is: ");
            ArrayServices.ArrayTranspose();
            break;
          }
        case 3:
          {
            ArrayServices.ArrayMin();
            break;
          }
        case 4:
          {
            ArrayServices.ArrayMax();
            break;
          }
        case 5:
          {
            System.out.println("Array is: ");
            ArrayServices.ArrayDisplay();
            break;
          }
        case 6:
          {
            System.out.println("Frequency of 'n' in Array is: ");
            ArrayServices.ArrayFreq();
            break;
          }
        case 0:
          {
            System.out.println("Array Exited Succefully: return code 0 ");
            System.exit(0);
            break;
          }
        default:
          {
            System.out.println(
              "Wrong Entry: Please input according to the option table"
            );
            break;
          }
      }
      System.out.println("Enter 1 to continue: ");
      System.out.println("Enter 0 to exit: ");
      n = sc.nextInt();
    } while (n != 0);
    sc.close();
  }
}
