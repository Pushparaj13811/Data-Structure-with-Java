import java.util.*;

class primeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }if ( isPrime == true){
            System.out.print("The number is prime.");
        
        }else{
            System.out.print("The number is composite.");
        }
    }

}