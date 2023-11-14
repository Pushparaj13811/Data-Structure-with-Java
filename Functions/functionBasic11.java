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
