package leetcode.easy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {

    if (strs.length == 0) {
      return "";
    }


    int[] lenArrys = new int[strs.length];
    for (int i = 0; i < strs.length; i++) {
      lenArrys[i] = strs[i].length();
    }

    Arrays.sort(lenArrys);
    String res = "";
    for (int i = 1; i <= lenArrys[0]; i++) {

      Set<String> set = new LinkedHashSet<String>();
      for (String s : strs) {
        set.add(s.substring(0, i));
      }

      if (set.size() == 1) {
        for (String value : set) {
          res = value;
        }
      }
    }

    return res;


  }
}
