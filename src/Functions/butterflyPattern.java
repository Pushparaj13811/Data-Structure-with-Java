import java.util.*;
public class butterflyPattern {
    public static void butterfly(int row){
        int n = row/2;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <=((n*2)-(i*2)); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <=((n*2)-(i*2)); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n (rows) : ");
        int rows = sc.nextInt();
        butterfly(rows);
    }
}
