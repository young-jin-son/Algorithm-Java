package Programmers.Lv2;
import java.util.*;

class 올바른_괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push('(');
            else if (stack.isEmpty() || stack.pop() != '(') return false;
        }
        return stack.isEmpty();
    }
}