/*
 * Write a Java program to find the maximum sum of a subarray in a given integer array. Implement 
 * the solution using Kadane's algorithm, which efficiently computes the maximum sum subarray in a 
 * one-dimensional array.
 */
public class maxSumCalculatorWithKadanesAlgorithm {
    public static void kadanes(int array[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < array.length; i++) {
            cs = cs + array[i];
            if (cs < 0) {
                cs = 0;
            }
            if (cs > ms) {
                ms = cs;
            }
        }
        if (ms == 0) {
            ms = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (ms < array[i]) {
                    ms = array[i];
                }
            }
        }
        System.out.println("Maximum sum of given array is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, -4, -1, -2, -10, -5, -3 };
        kadanes(numbers);
    }
}
