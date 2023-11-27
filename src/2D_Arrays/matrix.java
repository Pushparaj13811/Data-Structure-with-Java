/*
 * This program shows how to create 2D-Array, Take input, print output and search the spectific element's
 * position in the array. If found return true if not return false.
 */
import java.util.*;

public class matrix {
    //Function to take input of 2D-Array
  public static void inputElement(int array[][]) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print("Enter the value of [" + i + "][" + j + "] :");
        array[i][j] = sc.nextInt();
      }
    }
  }
  //Function to print the value of 2D-Array
  public static void printResult(int array[][]){

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
  //Function to find the position of specific element from the 2D-Array
  public static boolean searchSpecificElement(int array[][], int key) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (key == array[i][j]) {
          System.out.println(
            "Element found in the position : (" + i + "," + j + ")"
          );
          return true;
        }
      }
    }
    System.out.println("Element not found.");
    return false;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row of the matrix : ");
    int row = sc.nextInt();
    System.out.print("Enter the col of the matrix : ");
    int col = sc.nextInt();
    int matrix[][] = new int[row][col];
    inputElement(matrix);
    System.out.println("The elements of the 2D-Array are : ");
    printResult(matrix);
    System.out.print("Enter the key value to search it in array : ");
    int key = sc.nextInt();
    searchSpecificElement(matrix, key);
  }
}
