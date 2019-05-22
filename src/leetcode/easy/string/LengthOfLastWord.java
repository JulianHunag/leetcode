package leetcode.easy.string;

public class LengthOfLastWord {

  public static int lengthOfLastWord(String s) {
    if(s.isEmpty()){
      return 0;
    }
     s =s.trim();
     s = s.substring(s.lastIndexOf(" ")+1,s.length());
    return s.length();
  }
  
  public static void main(String[] args) {
    System.out.println(LengthOfLastWord.lengthOfLastWord(" a"));
  }
  
}
