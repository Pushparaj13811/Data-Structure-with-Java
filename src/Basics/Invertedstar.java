public class Invertedstar {
    public static void main(String args []){
        int n = 4;
        for(int line = 1; line <= 4; line++){
            for(int star = 1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
