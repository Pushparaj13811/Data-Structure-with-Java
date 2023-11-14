import java.util.*;

public class ternaryOperator {
    public static void main(String args[]) {
        int Larger = (5 > 3) ? 5 : 3;
        System.out.println(Larger);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();
            String result = (marks > 33) ? "Pass" : "Fail";
            System.out.print(result);
        }       
    }
}
