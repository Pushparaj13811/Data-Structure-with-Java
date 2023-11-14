// Program to find whether the given number is palindrome or not
import java.util.*;
public class functionBasic {
    public static void isPalindrome(int num){
        int myNum = num;
        int newNum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            newNum = newNum * 10 + lastDigit;
            num /= 10;
        }
        if(myNum == newNum){
            System.out.println("The given number "+myNum+" is palindrome.");    
        }
        else{
            System.out.println("The given number "+myNum+ " is not palindrome.");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is palindrome or not : ");
        int a = sc.nextInt();
        isPalindrome(a);
    }
}
