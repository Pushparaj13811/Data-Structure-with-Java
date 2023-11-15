/*
 * Program to prind diamond pattern of rows (n*2)-1
 *   *
 *  ***
 * *****
 *  ***
 *   *
 */
import java.util.*;
public class dimond {
    public static void dimondPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = (n-1); i > 0; i--){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n (rows) : ");
        int rows = sc.nextInt();
        dimondPattern(rows);
    }
}
