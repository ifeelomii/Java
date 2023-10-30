import java.util.Scanner;

public class ArrayServices {

  //Menu
  public static void ArrayMenu()
  {
   System.out.println("Enter 1. for Addition of Two Arrays");
   System.out.println("Enter 2. for Transpose of Arrays");
   System.out.println("Enter 3. for finding minimum number from 2D Arrays");
   System.out.println("Enter 4. for finding maximum number from 2D Arrays");
   System.out.println("Enter 5. for Array Display");
   System.out.println("Enter 6. for Checking Frequency of number in 2D Array");
   System.out.println("Enter 0. To Exit");
  }

  // Addition Operation
  public static void ArrayAddition() {
    // System.out.println("Enter number of rows: ");
    // int m=sc.nextInt();
    // System.out.println("Enter number of columns: ");
    // int n=sc.nextInt();

    // int[][] arr1 = new int[m][n];
    // int[][] arr2 = new int[m][n]; 

    int[][] sum = new int[3][3];
    int[][] arr1 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
    int[][] arr2 = { { 3, 2, 1 }, { 3, 2, 1 }, { 3, 2, 1 } };

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        sum[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(sum[i][j]);
      }
      System.out.println();
    }
  }

  //Transpose Operation
  public static void ArrayTranspose() {
    int[][] transpose = new int[3][3];
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        transpose[i][j] = arr1[i][j];
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(transpose[i][j]);
      }
      System.out.println();
    }
  }

  //Minimum Of Array
  public static void ArrayMin() {
    int[][] arr1 = { { 4, 8, 2 }, { 1, 3, 4 }, { 9, 5, 7 } };
    int min = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (arr1[i][j] < min) {
          min = arr1[i][j];
        }
      }
    }

    System.out.println("Minimum number from array is: " + min);
  }

  //Maximum Of Array
  public static void ArrayMax() {
    int[][] arr1 = { { 4, 8, 2 }, { 1, 3, 4 }, { 9, 5, 7 } };
    int max = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (arr1[i][j] > max) {
          max = arr1[i][j];
        }
      }
    }

    System.out.println("Maximum number from array is: " + max);
  }

  //Displaying Array
  public static void ArrayDisplay() {
    int[][] arr1 = { { 4, 8, 2 }, { 1, 3, 4 }, { 9, 5, 7 } };

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr1[i][j]);
      }
      System.out.println();
    }
  }

  //Counting Frequency of an element
  public static void ArrayFreq() {
    Scanner sc1 = new Scanner(System.in);
    int[][] arr1 = { { 4, 8, 2 }, { 1, 3, 4 }, { 9, 5, 7 } };
    System.out.println("Enter number between 0-9: ");
    int n = sc1.nextInt();
    int cnt = 0;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (arr1[i][j] == n) {
          cnt++;
        }
      }
    }
    System.out.println("Frequency of number is: " + cnt);
  }
}
