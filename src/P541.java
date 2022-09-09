/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * <p>
 * 示例 1：
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 * <p>
 * 示例 2：
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/reverse-string-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P541 {
    public static void main(String[] args) {
        System.out.println(new P541().reverseStr("abcd", 3));
    }

    public void reverseString(char[] s,int left,int right) {
        while(left<right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }

    public String reverseStr(String s, int k) {
        char[] ar = s.toCharArray();
        int len = ar.length;
        for(int i =0;i<len; i+=2*k){
            reverseString(ar,i,Math.min(i+k,len)-1);
        }
        return new String(ar);
    }
}
