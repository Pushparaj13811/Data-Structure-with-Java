package Arrays;

import java.util.*;

public class menueLinearSearch {
    public static int linearSearch(String array[], String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;

    }

    public static void print(int index, String item) {
        if (index == -1) {
            System.out.println(item + " is not available.");
        } else {
            System.out.println(item + " is availabe and its index is " + index);
        }
    }

    public static void main(String args[]) {
        String menu[] = { "Biryani", "Butter Chicken", "Samosa", "Masala Dosa", "Chole Bhature", "Paneer Tikka" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of food item you want : ");
        String item = sc.nextLine();
        int index = linearSearch(menu, item);
        print(index, item);
    }
}
