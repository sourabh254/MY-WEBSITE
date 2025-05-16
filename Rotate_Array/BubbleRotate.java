// time O(n*k) & space O(1)


import java.util.Arrays;

public class BubbleRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int order = 3; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr, order);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        
        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}