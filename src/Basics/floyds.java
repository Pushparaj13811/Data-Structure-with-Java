public class floyds{
    public static void floyds_(int n, int num){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds_(5, 1);
    }
}