import java.util.*;
public class JavaBasicSecondDay {
    public static void main(String args[]){
        //try helps us to deal with the resource leak of sc
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the radius of the circle : ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.print("The area of circle having radius "+rad+" is : "+area);
        }
    }
}
