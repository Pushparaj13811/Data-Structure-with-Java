import java.util.*;

class evenOdd {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.print("The given number " + num + " is even.");

            } else {
                System.out.print("The given number " + num + " is odd.");
            }
        }
    }

}
