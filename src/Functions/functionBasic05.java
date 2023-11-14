// Program to find whether the given number is even or odd
import java.util.*;
public class functionBasic05 {
    public static String calculateOddEven(int num){
        if(num % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        String value = calculateOddEven(number);
        System.out.println("The given number is : "+ value);
    }
}
