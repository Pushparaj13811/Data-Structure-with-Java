
//function overloading using parameter
import java.util.*;

public class functionBasic09 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "How many value of sum do you want to calculate (2 and 3 only acceptable or enter 0 to exit) : ");
            int value = sc.nextInt();
            if (value == 0) {
                System.out.println("Exiting....................");
                break;
            }
            if (value == 2) {
                System.out.print("Enter the value of first number : ");
                int a = sc.nextInt();
                System.out.print("Enter the value of second number : ");
                int b = sc.nextInt();
                int sum = sum(a, b);
                System.out.println("The sum of " + a + " and " + b + " is : " + sum);
            } else if (value == 3) {
                System.out.print("Enter the value of first number : ");
                int a = sc.nextInt();
                System.out.print("Enter the value of second number : ");
                int b = sc.nextInt();
                System.out.print("Enter the value of third number : ");
                int c = sc.nextInt();
                int sum = sum(a, b, c);
                System.out.println("The sum of " + a + " and " + b + " is : " + sum);
            } else {
                System.out.println("You have choosen wrong option. Please, choose correct one.");
            }
        }

    }
}
