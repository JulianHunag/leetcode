package leetcode.easy;

import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.contains(" ")) {
            return false;
        }
        s = s.replaceAll(" ", "");
        boolean res = false;
        if (s.length() % 2 != 0) {
            res = false;
            return res;
        }

        int len = s.length() / 2;

        for (int i = 0; i < len; i++) {
            s = replaceAll(s);
        }

        if (s.length() == 0) {
            res = true;
        }

        return res;
    }


    public boolean isValid2(String s) {
        if (null == s) return false;

        HashMap<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');
        char[] sArrays = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (Character c : sArrays) {

            if (charMap.containsKey(c)) {

                if (stack.empty() || charMap.get(c) != stack.pop()) {
                    return false;
                }

            } else {
                stack.push(c);
            }
        }

        return stack.empty();

    }


    public String replaceAll(String s) {
        s = s.replaceAll("\\{\\}", "");
        s = s.replaceAll("\\(\\)", "");
        s = s.replaceAll("\\[\\]", "");
        return s;
    }
}
