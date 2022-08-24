import java.util.Arrays;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * 示例 1：
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * 提示：
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 * 进阶：
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P977 {

    public static void main(String[] args) {
        int[] x = new P977().sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println();
    }

    /**
     * 双指针法
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int left = 0,right = nums.length-1,site = nums.length -1;
        int[] res = new int[nums.length];
        while (left <= right){
            if (nums[left] * nums[left] < nums[right] * nums[right]){
                res[site--] = nums[right] * nums[right];
                right--;
            }else{
                res[site--] = nums[left] * nums[left];
                left++;
            }
        }
        return res;
    }

    /**
     * 投机取巧法 嘿嘿嘿
     * 执行用时：5 ms , 在所有 Java 提交中击败了23.63%的用户
     * 内存消耗：43.1 MB, 在所有 Java 提交中击败了61.78%的用户
     * @param nums
     * @return
     */
    public int[] sortedSquaresNormal(int[] nums) {
        for (int num : nums) {
            num *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
