package leetcode.easy.string;

/**
 * 查找第一个不重复的字符
 */
public class FirstUniqChar {

    public static int firUniqChar(String s){
        int start ,end ;
        int res = s.length();

        for(char ch = 'a'; ch <= 'z'; ch++){
            start = s.indexOf(ch);
            end = s.lastIndexOf(ch);
            if(start == end && start != -1){
                res = Math.min(res,start);
            }
        }

        if(res == s.length()){
            return -1;
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(FirstUniqChar.firUniqChar("loveleetcode"));
    }

}
