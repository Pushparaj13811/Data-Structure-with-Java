import java.util.*;

public class UserRange {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {

            int counter = 1;
            int range;
            System.out.print("Enter the maximum nummber to print : ");
            range = sc.nextInt();
            while (counter <= range) {
                System.out.print(counter + " ");
                counter++;
            }
        }
    }
}
