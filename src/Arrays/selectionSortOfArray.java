/*
 * Question: Implement the selection sort algorithm in Java to sort an array of integers in ascending order. 
 * Include a function to print the initial array, the number of swaps made during the sorting process, and the 
 * final sorted array. Use the array `{5, 4, 1, 2, 3}` as input.
 */
public class selectionSortOfArray {

  public static void selectionSort(int array[]) {
    int swap = 0;

    for (int i = 0; i < array.length; i++) {
      int minPos = i;
      for (int j = i + 1; j < array.length ; j++) {
        if (array[minPos] > array[j]) {
          minPos = j;
          swap++;
        }
      }
      //swap
      int temp = array[minPos];
      array[minPos] = array[i];
      array[i] = temp;
    }
    System.out.println("Swap : " + swap);
  }

  public static void printArray(int array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    int number[] = { 5, 4, 1, 2, 3 };
    printArray(number);
    selectionSort(number);
    printArray(number);
  }
}
