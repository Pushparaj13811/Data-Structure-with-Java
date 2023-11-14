import java.util.*;

class Bank {
    double amt;

    void getAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amt = sc.nextDouble();
        sc.close();
    }
}

class ICIC extends Bank {
    ICIC(double amount) {
        amt = amount;
    }

    void ICICInterest() {
        double interest = amt * 4.5 / 100;
        System.out.println("ICIC Bank Interest : " + interest);
    }
}

class HDFC extends Bank {
    HDFC(double amount) {
        amt = amount;
    }

    void HDFCInterest() {
        double interest = amt * 7.8 / 100;
        System.out.println("HDFC Bank Interest : " + interest);
    }
}

class BOB extends Bank {
    BOB(double amount) {
        amt = amount;
    }

    void BOBInterest() {
        double interest = amt * 6.5 / 100;
        System.out.println("BOB Bank Interest : " + interest);
    }
}

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        sc.close();

        ICIC icic = new ICIC(amount);
        icic.ICICInterest();

        HDFC hdfc = new HDFC(amount);
        hdfc.HDFCInterest();

        BOB bob = new BOB(amount);
        bob.BOBInterest();
    }
}
