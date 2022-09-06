import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个以行程长度编码压缩的整数列表nums。
 *
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]]（其中i >= 0），每一对都表示解压后子列表中有 freq个值为val的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 *
 * 请你返回解压后的列表。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/decompress-run-length-encoded-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1313 {
    public static void main(String[] args) {

    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i+1]);
            }
            i++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
