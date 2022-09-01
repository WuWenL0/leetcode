import java.util.Stack;

/**
 * 根据 逆波兰表示法，求表达式的值。
 * 有效的算符包括+、-、*、/。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 注意两个整数之间的除法只保留整数部分。
 * 可以保证给定的逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * <p>
 * 示例1：
 * 输入：tokens = ["2","1","+","3","*"]
 * 输出：9
 * 解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/evaluate-reverse-polish-notation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P150 {

    public static void main(String[] args) {
        System.out.println(new P150().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int right = Integer.parseInt(stack.pop());
                int left = Integer.parseInt(stack.pop());
                switch (token) {
                    case "+":
                        stack.push(String.valueOf(left + right));
                        break;
                    case "-":
                        stack.push(String.valueOf(left - right));
                        break;
                    case "*":
                        stack.push(String.valueOf(left * right));
                        break;
                    case "/":
                        stack.push(String.valueOf(left / right));
                        break;
                }
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
