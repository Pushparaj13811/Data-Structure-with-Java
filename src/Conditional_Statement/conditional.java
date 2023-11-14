import java.util.*;

class condition {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the age of the person : ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("The person is adult.");

            }
            else if (age >= 13 && age < 18) {
                System.out.println("The person is teenager");
            } else {
                System.out.println("The person is childern.");
            }
        }
    }
}