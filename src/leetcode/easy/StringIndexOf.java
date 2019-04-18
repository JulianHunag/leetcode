package leetcode.easy;

public class StringIndexOf {
  
  public int strStr(String haystack, String needle) {
    if(null == needle || "".equals(needle)){
      return 0;
    }
    
    if(null == haystack || "".equals(haystack)){
      return -1;
    }
    
    for(int i = 0; i<=haystack.length()-needle.length();i++){
      if(haystack.charAt(i)==needle.charAt(0)){
        if(needle.equals(haystack.substring(i,i+needle.length()))){
          return i;
        }
      }
    }
    
    return -1;
    
  }
  
  

  
  public static void main(String[] args) {
   int res =  new StringIndexOf().strStr("", "");
   System.out.println();
   System.out.println("res:" +res);
  }
  

}
