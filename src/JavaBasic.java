import java.util.*;

public class JavaBasic {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a: ");
            int firstValue = sc.nextInt();
            System.out.print("Ente the value of b: ");
            int secondValue = sc.nextInt();
            int sum = firstValue + secondValue;
            System.out.print("The sum of "+firstValue+" and "+secondValue+" is : "+ sum);
        }catch(InputMismatchException e){
            System.out.print("The value enter by you is not valid integer. Please enter the valid integer.");
        }

    }
}