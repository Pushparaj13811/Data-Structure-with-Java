// Program to calculate sum of digits of given number
import java.util.*;
public class functionBasic13 {
    public static int sumOfDigit(int num){
        int sum = 0; 
        while(num > 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate sum of its digit : ");
        int digit = sc.nextInt();
        int sum = sumOfDigit(digit);
        System.out.println("The sum of digit of "+digit+" is : "+ sum);
    }
}
