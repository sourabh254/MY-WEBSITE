import java.util.Arrays;

public class IntermediateJava {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int k = 3; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(nums));

        rotate(nums, k);

        System.out.println("Rotated array: " + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }

        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}