/**
 * 给你一个数组arr，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用-1 替换。
 * 完成所有替换操作后，请你返回这个数组。
 *
 * 示例 1：
 *
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 * 解释：
 * - 下标 0 的元素 --> 右侧最大元素是下标 1 的元素 (18)
 * - 下标 1 的元素 --> 右侧最大元素是下标 4 的元素 (6)
 * - 下标 2 的元素 --> 右侧最大元素是下标 4 的元素 (6)
 * - 下标 3 的元素 --> 右侧最大元素是下标 4 的元素 (6)
 * - 下标 4 的元素 --> 右侧最大元素是下标 5 的元素 (1)
 * - 下标 5 的元素 --> 右侧没有其他元素，替换为 -1
 * 示例 2：
 *
 * 输入：arr = [400]
 * 输出：[-1]
 * 解释：下标 0 的元素右侧没有其他元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1299 {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[res.length-1] = -1;
        for (int i = res.length-2; i >= 0; i--) {
            res[i] = Math.max(res[i+1], arr[i+1]);
        }
        return res;
    }

    /**
     * 暴力解法
     * @param arr
     * @return
     */
    public int[] replaceElementsNormal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > max){
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}
