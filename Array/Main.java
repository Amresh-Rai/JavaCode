package Array;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        SortedColor sol = new SortedColor();
        sol.sortColors(nums);

        System.out.println("Sorted colors:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// Class containing the sorting function
class SortedColor {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
