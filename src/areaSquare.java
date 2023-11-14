import java.util.*;
public class areaSquare {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the side of the square : ");
            float a = sc.nextFloat();
            //int $ = 4;
            float area = a * a;
            System.out.print("The area of square having side "+a+" is : "+area);
            //System.out.print($);

        }
    }

}
