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
    int numbers[] = { 1, 2, 3, 5, 4  };
    bubbleSortOfArray(numbers);
    printArray(numbers);
  }
}
