/*
 * Question: Implement the insertion sort algorithm in Java to sort an array of integers in ascending order. 
 * Include a function to print the sorted array. Use the array `{5, 4, 1, 3, 2}` as input and print the sorted array.
 */
public class insertionSortOfArray {

  public static void insertionSort(int array[]) {
    for (int i = 0; i < array.length; i++) {
      int curr = array[i];
      int prev = i - 1;
      while(prev >= 0 && array[prev] > curr){
        array[prev + 1] = array[prev];
        prev--;
      }
      array[prev + 1] = curr;
    }
  }
  public static void printArray(int array[]){
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+" ");
    }
  }
  public static void main(String args[]){
    int numbers[] = {5,4,1,3,2};
    insertionSort(numbers);
    printArray(numbers);
  }
}
