// Program to calculate sum of two given number
import java.util.*;
public class functionBasic02 {
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbre : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
    }
}
