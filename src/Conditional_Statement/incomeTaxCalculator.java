import java.util.*;
public class incomeTaxCalculator {
    public static void main(String args[]){
        int income, tax;
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter your income : ");
        income = sc.nextInt();
        if(income < 500000){
            tax = (int) (income * 0.05);
            System.out.print("The tax to be paid having incomr "+income+" is : "+tax);
        }
        else if (income > 500000 && income <1000000){
            tax = (int)(income * 0.2);
            System.out.print("The tax to be paid having incomr "+income+" is : "+tax);
        }
        else {
            tax = (int)(income * 0.3);
            System.out.print("The tax to be paid having incomr "+income+" is : "+tax);
        }
        }

    }
}
