import java.util.*;
public class AvgNum {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the first number : ");
            int a = sc.nextInt();
            System.out.print("Enter the second number : ");
            int b = sc.nextInt();
            System.out.print("Enter the third number : ");
            int c = sc.nextInt();
            float avg = (a + b + c)/3;
            System.out.print("The average of the above given number is : "+ avg);

        }

    }
}
