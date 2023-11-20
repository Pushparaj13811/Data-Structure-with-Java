/*
 * Write a Java program to find the maximum sum of a subarray in a given integer array. 
 * Implement the solution using a prefix sum array and nested loops. The program should 
 * calculate the maximum sum efficiently and print the result.
 */
public class MaxSumCalculatorWithPrefixArray {
    public static void maxSubArraySum(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }
        for (int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i ; j < array.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum of the given array is : "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1,-1,5,4,7};
        maxSubArraySum(numbers);
    }
}
