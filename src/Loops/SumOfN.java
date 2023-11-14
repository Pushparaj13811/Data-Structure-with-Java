import java.util.*;

public class SumOfN {
    public static void main(String args[]) {
        int i, sum, N;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            N = sc.nextInt();
            i = 1;
            sum = 0;
            while (i <= N) {
                sum += i;
                i++;
            }
            System.out.print("The total sum is " + sum);
        }

    }

}
