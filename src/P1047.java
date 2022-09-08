/**
 * 给出由小写字母组成的字符串S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * <p>
 * 示例：
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P1047 {
    public static void main(String[] args) {
        System.out.println(new P1047().removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String s) {
        StringBuffer stackStr = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (stackStr.length() > 0 && stackStr.charAt(stackStr.length() - 1) == c) {
                stackStr.deleteCharAt(stackStr.length() - 1);
            } else {
                stackStr.append(c);
            }
        }
        return stackStr.toString();
    }
}
