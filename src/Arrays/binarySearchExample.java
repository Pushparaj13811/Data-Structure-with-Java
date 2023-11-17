/*
 * Implement a Java program that performs binary search on a sorted array. Include a method `binarySearch` 
 * that takes an array and a value to search for, and returns the index of the value if found, or -1 if 
 * the value is not present. Additionally, provide a `main` method that initializes a sorted array, specifies 
 * a key to search for, and prints the index of the key obtained from the binary search.
 */
public class binarySearchExample {
    public static int binarySearch(int array[], int value) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (value > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 5, 6, 8, 9, 12, 23, 35, 45, 66, 90 };
        int key = 12;
        System.out.println("Index of given key is : " + binarySearch(number, key));
    }
}