import java.util.*;

public class largestNumInThree {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of A: ");
            int A = sc.nextInt();
            System.out.print("Enter the value of B: ");
            int B = sc.nextInt();
            System.out.print("Enter the value of C: ");
            int C = sc.nextInt();
            if ((A > B) && (A > C)) {
                System.out.println("A is the largest Number.");
            }
            else if (B > C){
                System.out.println("B is the largst Number.");
            }
            else{
                System.out.println("C is the largest Number.");
            }
        }
    }
}