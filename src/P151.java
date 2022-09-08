import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-words-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P151 {
    public static void main(String[] args) {
        System.out.println(new P151().reverseWords("the sky is blue"));
    }

    public String reverseWords(String s) {
        String[] strArr = Arrays.stream(s.split(" ")).filter(e -> e.length() > 0).toArray(String[]::new);
        for (int i = 0; i < strArr.length / 2; i++) {
            String temp = strArr[i];
            strArr[i] = strArr[strArr.length - 1 - i];
            strArr[strArr.length - 1 - i] = temp;
        }
        return String.join(" ", strArr);
    }

    public String reverseWords2(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
