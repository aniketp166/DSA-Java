public class FindMiddleIndexInArray1991
{

    public int findMiddleIndex(int[] nums) {
        int rtSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rtSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            rtSum -= nums[i];
            if (leftSum == rtSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
}
