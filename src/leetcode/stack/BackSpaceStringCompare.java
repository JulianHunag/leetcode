package leetcode.stack;

import java.util.Stack;

/**
 *844 https://leetcode.com/problems/backspace-string-compare/
 */
public class BackSpaceStringCompare {

    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    /**
     * 使用stack
     * @param s
     * @return
     */
    public static String build1(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if('#'!=c){
                stack.push(c);
            }else if(!stack.empty()){
                stack.pop();
            }
        }
        System.out.println(String.valueOf(stack));
        return String.valueOf(stack);
    }


    /**
     * 使用stringbuffer
     * @param s
     * @return
     */
    public static String build2(String s){

        StringBuffer sb = new StringBuffer();
        for(Character c : s.toCharArray()){
            if('#'!=c){
                sb.append(c);
            }else if (sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }
        }

       return sb.toString();
    }


    /**
     * Runtime: 0 ms, faster than 100.00%
     * @param s
     * @return
     */
    public static String build(String s){
        int count = 0;
        char[] arr = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = arr.length-1; i >=0 ; i--) {
            if('#'==arr[i]){
                count++;
            }else {
                if(count>0){
                    count--;
                }else{
                    sb.append(arr[i]);
                }
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        boolean res = BackSpaceStringCompare.backspaceCompare("a#ce#","b#cee##");
        System.out.println(res);
    }

}
