// Program to calculate factorial of given number
import java.util.*;
public class functionBasic06 {
    public static int calculateFactorial(int num){
        int fact = 1;
        for(int i=1; i<= num; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate facotrial : ");
        int a = sc.nextInt();
        int fact = calculateFactorial(a);
        System.out.println("The factorial of "+a+" is : "+fact);
    }
}
