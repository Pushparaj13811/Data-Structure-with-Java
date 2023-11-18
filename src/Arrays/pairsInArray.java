import java.util.*;

public class pairsInArray {
    public static void printPairs(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + ", " + array[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are : " + count);
    }

    public static void input(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for [" + i + "] :- ");
            array[i] = sc.nextInt();
        }
    }

    public static void output(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to create array of : ");
        int value = sc.nextInt();
        int array[] = new int[value];
        input(array);
        System.out.print("The array given by you is : ");
        output(array);
        System.out.println("\nPairs are : ");
        printPairs(array);

    }
}