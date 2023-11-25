/*
 * Implement counting sort in Java to sort an array of integers in ascending order. 
 * Include a function to print the sorted array. Use the array {1, 4, 1, 3, 2, 4, 3, 7} as input.
 */
public class countingSortOfArray {

  public static void countingSort(int array[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      largest = Math.max(largest, array[i]);
    }
    int count[] = new int[largest + 1];
    for (int i = 0; i < array.length; i++) {
      count[array[i]]++;
    }
    //Sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        array[j] = i;
        j++;
        count[i]--;
      }
    }
  }
  public static void printArray(int array[]){
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+" ");
    }
  }
  public static void main(String args[]){
    int numbers[] = {1,4,1,3,2,4,3,7};
    countingSort(numbers);
    printArray(numbers);
  }
}
