// O(1)space and O(n)time.
// Assuming we are given 1,2,3,4,5,6 and order 2.Thebasicideais:
// 1.Dividethearraytwoparts:1,2,3,4and5,6
// 2.Rotatefirstpart:4,3,2,1,5,6
// 3.Rotatesecondpart:4,3,2,1,6,5
// 4.Rotatethewholearray:5,6,1,2,3,4



import java.util.Arrays;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int order = 3; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr, order);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int order) {
        order = order % arr.length; // Ensure order does not exceed array length
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        int a = arr.length - order;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1) return;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}