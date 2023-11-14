import java.util.*;
public class functionBasic03 {
    public static int calculateAverage(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3 ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        int Average = calculateAverage(a, b, c);
        System.out.print("The average of given numbers is :"+Average);

    }
}
