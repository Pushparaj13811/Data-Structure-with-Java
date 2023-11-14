// Program to print pyramid of given rows and columns
public class Pyramid {
    public static void invPyr(int totRow, int totCol){
        for(int i = 1; i <= totRow; i++){
            int space = totRow - i;
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int l = 1; l <= i-1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invPyr(6,6);
    }
}
