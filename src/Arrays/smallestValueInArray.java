/*
 * Program to find the smallest number in the given array using linear search algorithm.
 */
public class smallestValueInArray {
    public static int getSmallest(int array[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {55, 20, 45, 89, 12, 10, 58, 88, 100, 345};
        int smallest = getSmallest(numbers);
        System.out.println("The smallest number in the given array is : "+ smallest);
    }
}
