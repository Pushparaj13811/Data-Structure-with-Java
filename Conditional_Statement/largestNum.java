import java.util.*;

public class largestNum {
    public static void main(String args[]) {
        int firstNum, secondNum;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the First Number : ");
            firstNum = sc.nextInt();
            System.out.print("Enter the second Number : ");
            secondNum = sc.nextInt();
            if ( firstNum > secondNum){
                System.out.print("The greatest number between "+firstNum + " and "+secondNum+" is :"+ firstNum);
            }
            else{
                System.out.print("The greatest number between "+firstNum + " and "+secondNum+" is :"+ secondNum);
            }
        }
    }
}
