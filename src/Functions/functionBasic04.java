// Program to calculate value of the number n rase to p
import java.util.*;
import java.lang.Math;
public class functionBasic04 {
    public static int calculatePower(int num1, int num2){
        int power = (int) Math.pow(num1, num2);
        return power;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number : ");
        int basNum = sc.nextInt();
        System.out.print("Enter the power number : ");
        int powNum = sc.nextInt();
        int power = calculatePower(basNum, powNum);
        System.out.println("The power is : "+ power);
    }
}
