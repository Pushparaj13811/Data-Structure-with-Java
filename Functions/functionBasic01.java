
public class functionBasic01{
    public static int printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 2;
    }
    public static void main(String argd[]){
        //printHelloWorld();
        int returnValue = printHelloWorld();
        System.out.println(returnValue);
    }
}