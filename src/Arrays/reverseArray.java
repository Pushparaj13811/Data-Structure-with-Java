/*
 * program that takes user input to populate an array, displays the original array,
 * reverses the order of its elements, and finally, prints the reversed array.
 */
import java.util.*;

class reverseArray {
    public static void input(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value of array [" + i + "] :");
            array[i] = sc.nextInt();

        }
    }

    public static void output(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse(int array[]) {
        int first = 0, last = array.length - 1;
        while (first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element you want to enter in array : ");
        int length = sc.nextInt();
        int array[] = new int[length];
        input(array);
        System.out.print("Array of integer : ");
        output(array);
        reverse(array);
        System.out.print("\nRevered array of interger : ");
        output(array);

    }
}