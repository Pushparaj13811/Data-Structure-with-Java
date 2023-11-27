/*
 * Question: Implement the bubble sort algorithm in Java to sort an array of integers in ascending order. 
 * Include a function to print the sorted array. Use the array `{1, 2, 3, 5, 4}` as input and print the sorted array. 
 * Additionally, print the number of swaps made in each pass.
 */
public class bubbleSort {

  public static void bubbleSortOfArray(int array[]) {
    for (int turn = 0; turn < array.length - 1; turn++) {
      int swap = 0;
      for (int j = 0; j < array.length - 1 - turn; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swap++;
        }
      }
      if (swap == 0) {
        break;
      }
      System.out.println("Swap : " + swap);
    }
  }

  public static void printArray(int array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void main(String args[]) {
    int numbers[] = { 1, 2, 3, 5, 4 };
    bubbleSortOfArray(numbers);
    printArray(numbers);
  }
}
