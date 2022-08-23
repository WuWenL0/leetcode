/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P209 {
    public static void main(String[] args) {
        System.out.println(new P209().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    /**
     * 滑动窗口
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    /**
     * 暴力法
     * 超出时间限制
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLenbl(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];
                if (count >= target) {
                    minLength = Math.min(minLength, j - i);
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength + 1;
    }
}
