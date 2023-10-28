public class ArrayPairsAredivisibleByK1497 {
    public boolean canArrange(int[] arr, int k) {
        int[] nums = new int[k];
        // filling reminder array
        for (int i = 0; i < arr.length; i++) {
            int index = (arr[i] % k + k) % k;
            nums[index]++;
        }

        // odd count
        if (nums[0] % 2 != 0)
            return false;

        for (int i = 1; i <= k / 2; i++) {
            if (nums[i] != nums[k - i])
                return false;
        }
        return true;
    }
}
