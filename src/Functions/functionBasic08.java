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
