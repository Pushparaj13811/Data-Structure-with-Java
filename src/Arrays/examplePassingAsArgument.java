/*
 * Program to check the input print and updation of an array. (Passing by refrence)
 */

import java.util.*;
public class examplePassingAsArgument{
    public static void update(int array[]){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + 1;
        }

    }
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void input(int array[]){
        for(int i = 0; i < array.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of ["+i+"] : " );
            int arrayValue = sc.nextInt();
            array[i] =  arrayValue;
        }
    }
    public static void main(String args[]){
        int marks[] = new int[1];
        input(marks);
        System.out.print("The values are : " );
        print(marks);
        update(marks);
        System.out.print("The values after calling update function : " );
        print(marks);
    }
}