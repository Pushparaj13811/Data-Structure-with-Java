// Optimised program to find and print all the prime number in the given range
import java.util.*;

public class optimised {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        if (n >= 2) {
            System.out.print(2 + " ");
            count++;
        }
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime) / 1000;
        System.out.println();
        System.out.println("The total number of prime numbers between 2 and " + n + " is: " + count);
        System.out.println("The execution time of this program is: " + executionTime + " seconds");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum value till which you want to print primes: ");
        int n = sc.nextInt();
        primeInRange(n);
    }
}
