package leetcode.array;

import java.util.Arrays;

/**
 * 344 https://leetcode.com/problems/reverse-string/
 * 反转string
 */
public class ReverseString {

    public static void reverseString(char[] s){

        int i = 0;
        int j = s.length-1;
        while (i<j){
            swap(s,i,j);//互换
            i++;
            j--;
        }

        System.out.println(Arrays.toString(s));

    }

    public static void swap(char[] s,int i,int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }


    public static void main(String[] args) {
        ReverseString.reverseString(new char[]{'h','e','l','l','o'});
    }

}
