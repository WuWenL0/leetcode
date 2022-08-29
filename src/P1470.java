/**
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 * <p>
 * 示例 1：
 * 输入：nums = [2,5,1,3,4,7], n = 3
 * 输出：[2,3,5,4,1,7]
 * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,3,4,4,3,2,1], n = 4
 * 输出：[1,4,2,3,3,2,4,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/shuffle-the-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1470 {

    public static void main(String[] args) {
        int[] shuffle = new P1470().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println(1);
    }

    public int[] shuffle(int[] nums, int n) {
        int[] arrs = new int[nums.length];
        for (int i = 0; i < n; i++) {
            arrs[2 * i] = nums[i];
            arrs[2 * i + 1] = nums[i + n];
        }
        return arrs;
    }

//    public int[] shuffle(int[] nums, int n) {
//        int[] arrs = new int[nums.length];
//        int slow = 0, fast = n;
//        for (int i = 0; i < arrs.length; i++) {
//            if (i % 2 == 0) {
//                arrs[i] = nums[slow++];
//            }else{
//                arrs[i] = nums[fast++];
//            }
//        }
//        return arrs;
//    }
}
