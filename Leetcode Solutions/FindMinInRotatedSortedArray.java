public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        int n = nums.length, low = 0, high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }
}
