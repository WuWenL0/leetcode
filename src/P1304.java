/**
 * 给你一个整数n，请你返回 任意一个由 n个 各不相同的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 * 示例 1：
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-n-unique-integers-sum-up-to-zero
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1304 {
    public static void main(String[] args) {

    }

    public int[] sumZero(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n-1; i++) {
            nums[i] = i+1;
        }
        nums[n-1] = -1 * ((1+(n-1))*(n-1)/2);
        return nums;
    }
}
