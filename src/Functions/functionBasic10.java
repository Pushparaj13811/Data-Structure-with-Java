//Program to find and print all the prime numbers in the given range
import java.util.*;
import java.lang.Math;

public class functionBasic10 {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime) / 1000;
        System.out.println();
        System.out.println("The total no of prime number in between 2 to " + n + " is :" + count);
        System.out.println("The execution time of this program is : " + executionTime+" second");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum value till which you want to print prime : ");
        int n = sc.nextInt();
        primeInRange(n);
        System.currentTimeMillis();
    }
}
