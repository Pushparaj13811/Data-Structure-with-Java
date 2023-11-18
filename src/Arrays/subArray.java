import java.util.*;

public class subArray {
    public static void input(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for [" + i + "] :- ");
            array[i] = sc.nextInt();
        }
    }

    public static void largetSum(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }

        }
        System.out.println("The largest sum of sub array is : " + largest);

    }

    public static void smallestSum(int array[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }

        }
        System.out.println("The smallest sum of sub array is : " + smallest);

    }

    public static void output(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void printSubArray(int array[]) {
        int totalSubArray = (array.length * (array.length + 1)) / 2;
        int sumsArray[] = new int[totalSubArray];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                    System.out.print(array[k] + " ");
                }
                sumsArray[index++] = sum;
                System.out.print("Sum = " + sum);
                System.out.println();

            }
            System.out.println();
        }
        largetSum(sumsArray);
        smallestSum(sumsArray);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to create array of : ");
        int value = sc.nextInt();
        int numbers[] = new int[value];
        input(numbers);
        System.out.print("The elements of array given by you are : ");
        output(numbers);
        System.out.println();
        printSubArray(numbers);
    }
}
