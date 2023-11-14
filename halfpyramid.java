public class halfpyramid {
    public static void main(String args[]){
        int number = 5;
        for(int i = 1; i <=number; i++){
            for(int j = 1; j <= number-i+1; j++){
                System.out.print(j);
            }
            /* 
            for(int k = 1; k <= i; k++){
                System.out.print('*');
            }
            */
            System.out.println();
        }

    }
}
