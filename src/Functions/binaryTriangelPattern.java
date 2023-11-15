/*
 Binary Triangle pattern 
 1
 01
 101
 0101
 10101
 */

import java.util.*;
public class binaryTriangelPattern {
    public static void triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entert the number of rows n : ");
        int row = sc.nextInt();
        triangle(row);
    }
}
