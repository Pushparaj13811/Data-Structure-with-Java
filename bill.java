import java.util.*;
public class bill {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the price of pencil : ");
            float pencil = sc.nextFloat();
            System.out.print("Enter the price of pen : ");
            float pen = sc.nextFloat();
            System.out.print("Enter the price of ereaser : ");
            float ereaser = sc.nextFloat();
            float total = pencil + pen + ereaser;
            float tax = (18 * total)/100;
            float amount = total - tax;
            System.out.println("Bill Receipt");
            System.out.println("-------------------------");
            System.out.println("Pencil = "+pencil);
            System.out.println("Pen = "+pen);
            System.out.println("Ereaser = "+ereaser);
            System.out.println("-------------------------");
            System.out.println("Total =     "+total);
            System.out.println("Tax(18%) = -"+tax);
            System.out.println("Amount to be paid = "+amount);
        }
    }
    
}