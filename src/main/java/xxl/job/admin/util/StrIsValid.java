package xxl.job.admin.util;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StrIsValid {

    public static void main(String[] args) {
        String st="{[]}";
        boolean valid = isValid(st);
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        char[] chars1 = s.toCharArray();
        if (chars1.length % 2 != 0) {
            return false;
        }
        if(s.startsWith(")")||s.startsWith("]")||s.startsWith("}")){
            return false;
        }
        Deque<Character> stackLeft=new ConcurrentLinkedDeque();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                stackLeft.push(aChar);
                continue;
            }
            if (aChar == ')') {
                Character peek = stackLeft.peek();
                if (peek != null && peek == '(') {
                    stackLeft.pop();
                }else{
                    stackLeft.push(aChar);
                }
            }
            if (aChar == ']') {
                Character peek = stackLeft.peek();
                if (peek != null && peek == '[') {
                    stackLeft.pop();
                }else{
                    stackLeft.push(aChar);
                }
            }
            if (aChar == '}') {
                Character peek = stackLeft.peek();
                if (peek != null && peek == '{') {
                    stackLeft.pop();
                }else{
                    stackLeft.push(aChar);
                }
            }
        }
        if(stackLeft.isEmpty()){
            return true;
        }
        return false;
    }
}
