# Learning Progress - Data Structures and Algorithms in Java

## Week 1:
- [x] Course Introduction
- [x] Prerequisites - Installation Resources
- [x] Flowcharts & Pseudocodes
- [x] Variable & Data Structure
### Code Snippets:
```
// Flowcharts & Pseudocodes Code Snippets

// Example code for Flowcharts & Pseudocodes
public class FlowchartPseudocodeExample {
    public static void main(String[] args) {
        // Pseudocode: Read two numbers from the user
        int number1 = getUserInput();
        int number2 = getUserInput();
        
        // Pseudocode: Calculate the sum of two numbers
        int sum = calculateSum(number1, number2);
        
        // Flowchart: Display the result
        displayResult(sum);
    }

    // Pseudocode: Function to get user input
    private static int getUserInput() {
        // Code to read input from the user
        // Replace this with actual code to read input
        return 0; // Placeholder value
    }

    // Pseudocode: Function to calculate sum
    private static int calculateSum(int a, int b) {
        // Code to calculate sum
        // Replace this with actual code to calculate sum
        return a + b; // Placeholder value
    }

    // Flowchart: Function to display the result
    private static void displayResult(int result) {
        // Code to display the result
        // Replace this with actual code to display result
        System.out.println("Result: " + result);
    }
}
```
```
public class VariablesExample {
    public static void main(String[] args) {
        // Integer variable
        int age = 25;

        // Floating-point variable
        double salary = 50000.0;

        // String variable
        String name = "John Doe";

        // Boolean variable
        boolean isStudent = false;

        // Character variable
        char grade = 'A';

        // Displaying the values of variables
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Name: " + name);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
    }
}

```
## Week 2:
- [x] Operators
  - Types of operators, Arithmetic, Unary, Relational, Logical, Assignment
  - Operator precedence
  - Solved questions
- [x] Conditional Statements
  - If else, else if, switch case, Ternary operators
  - Solved questions including:
    - Printing the largest number among 2 numbers
    - Checking if a number is odd or even
    - Income tax calculator
    - Printing the largest number in 3 numbers
    - Checking if a student is pass or fail
    - Simple calculator
### Code Snippets:
```
public class LargestNumberExample {
    public static void main(String[] args) {
        // Solved question: Printing the largest number among 2 numbers
        int num1 = 20;
        int num2 = 30;

        int result = (num1 > num2) ? num1 : num2;

        System.out.println("The largest number is: " + result);
    }
}

```
```
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // Solved question: Income Tax Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax;

        // Simple tax calculation logic (replace with your actual tax calculation logic)
        if (income <= 50000) {
            tax = 0.05 * income;
        } else if (income <= 100000) {
            tax = 0.1 * income;
        } else {
            tax = 0.15 * income;
        }

        System.out.println("Your income tax is: " + tax);

        scanner.close();
    }
}

```
## Week 3:
- [x] Loops (Flow Control)
  - Loops Basic, While loop, For loop, do-while loop
  - Break statement, Continue statement
  - Solved questions including:
    - Printing numbers from 1 to 10
    - Printing numbers from 1 to n
    - Sum of first n natural numbers
    - Printing square pattern
    - Printing reverse of a number
    - Checking if a number is prime or not
- [x] Pattern (Part-I)
  - Solved questions including:
    - Printing star pattern
    - Printing inverted star pattern
    - Printing half-pyramid pattern
    - Printing character pattern
### Code Snippets:
```
public class PrintNumbersExample {
    public static void main(String[] args) {
        // Solved question: Printing numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```
```
public class StarPatternExample {
    public static void main(String[] args) {
        // Solved question: Printing star pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
## Week 4:
- [x] Functions and Methods
  - Introduction to functions
  - Syntax of function
  - Parameters vs argument
  - Memory visualization while creating function
  - Call by value and call by reference
  - Function overloading
  - Solved questions including:
    - Product of a & b
    - Finding factorial
    - Finding Binomial Coefficient
    - Checking if a number is prime or not
    - Finding primes in a range
    - Binary to decimal
    - Decimal to Binary conversion using code
    - Method scope and Block Scope
### Code Snippets:
```
//Program to find bionomial coefficient of given n and r
import java.util.*;
public class functionBasic08 {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static double binomialCoefficient(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr = n - r;
        int nr_fact = factorial(nr);
        double binomialCoef = (double) n_fact/(r_fact*nr_fact);
        return binomialCoef;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        double binomialCoeff = binomialCoefficient(n, r);
        System.out.println("Binomial Coefficient of n = "+n+" r = "+r+" is : "+binomialCoeff);
    }
}

```
```
//Program to convert binary number into decimal number
public class functionBasic11 {
    public static void binaryToDecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number: " + binNum);
                return;
            }
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            binNum /= 10;
            pow++;
        }
        System.out.println("The decimal number of " + myNum + " is : " + dec);

    }

    public static void main(String args[]) {
        binaryToDecimal(101);
    }
}
```

## Week 5 :
- [x] Pattern Advance (Part-II)
   - Solved questions including:
    - Printing Hollow rectangle pattern
    - Printing Inverted and rotated Half pyramid
    - Printing Inverted half pyramid with numbers
    - Printing Floyd's triangle pattern
    - Printing 0-1 Triangle pattern
    - Printing Butterfly pattern
    - Printing Solid Rhombus pattern
    - Printing Hollo Rhombus pattern
    - Printing Diamond pattern 

### Coce Snippets:
```
// Program to print Hollow rectangle 
public class functionBasic14 {
    public static void hollowRectangle(int totRow, int totCol) {
        for (int i = 1; i <= totRow; i++) {
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollowRectangle(5, 4);
    }
}

```
```
public class floyds{
    public static void main(String args[]){
        int n = 5;
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
```
```
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

```
## Week 6:
- [x] Arrays:
    - Introduction of array
    - How to create array ?
    - Array as function argument.
    - Linear search
    - Largest in array 
    - Binary search 
    - Reverse in array
    - Maximum sum calculator using pairs in Array 
    - Kadane's Algorithm
    - Trapping Of Rainwater
    - Buying and Selling Stock
- [x] Different method of sorting of Arrays (Basic sorting algorithm):
    - Bubble Sort
    - Selection Sort
    - Insertion Sort
    - Counting Sort

### Coce Snippets:
```
import java.util.*;

public class pairsInArray {
    public static void printPairs(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + ", " + array[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are : " + count);
    }

    public static void input(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for [" + i + "] :- ");
            array[i] = sc.nextInt();
        }
    }

    public static void output(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to create array of : ");
        int value = sc.nextInt();
        int array[] = new int[value];
        input(array);
        System.out.print("The array given by you is : ");
        output(array);
        System.out.println("\nPairs are : ");
        printPairs(array);

    }
}

```
```
/*
 * Write a Java program to find the maximum sum of a subarray in a given integer array. Implement 
 * the solution using Kadane's algorithm, which efficiently computes the maximum sum subarray in a 
 * one-dimensional array.
 */
public class maxSumCalculatorWithKadanesAlgorithm {
    public static void kadanes(int array[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < array.length; i++) {
            cs = cs + array[i];
            if (cs < 0) {
                cs = 0;
            }
            if (cs > ms) {
                ms = cs;
            }
        }
        if (ms == 0) {
            ms = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (ms < array[i]) {
                    ms = array[i];
                }
            }
        }
        System.out.println("Maximum sum of given array is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, -4, -1, -2, -10, -5, -3 };
        kadanes(numbers);
    }
}

```
```
/* 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your
 * profit by choosing a single day to buy one stock and choosinf a different day in future to sell that stock. Return 
 * the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class buySellStocks{
    public static int buyAndSellStocks(int array[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < array.length; i++){
            if(buyPrice < array[i]){
                int profit = array[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = array[i];
            }
        }

        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print("The maximum profit which can be generated is : "+buyAndSellStocks(prices));
    }
}

```
## Week 7 (In Progress):
- [x] 2D-Arrays:
    - Introduction, real life examples, representation of 2D-Array.
    - Creating a 2D array, taking input, printing output, and searching for any given element. 