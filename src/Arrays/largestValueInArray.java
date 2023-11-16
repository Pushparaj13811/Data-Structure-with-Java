/*
 * Program to find the largest number in the given array using linear search algorithm.
 */
import java.util.*;

public class largestValueInArray {
    public static int getLargest(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String arga[]){
        int number[] ={1, 4, 7, 0, 22, 54, 2, 3, 5};
        int largest = getLargest(number);
        System.out.println("largest number in this array is : "+ largest );
    }
}
