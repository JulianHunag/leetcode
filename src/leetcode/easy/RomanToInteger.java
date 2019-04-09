package leetcode.easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
  Map<String, Integer> map = new LinkedHashMap<String, Integer>();
  Map<String, Integer> mapTwo = new LinkedHashMap<String, Integer>();

  public int romanToInt(String s) {
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);
    mapTwo.put("CM", 900);
    map.put("F", 900);
    mapTwo.put("XCD", 390);
    map.put("A", 390);
    mapTwo.put("CD", 400);
    map.put("N", 400);
    mapTwo.put("XC", 90);
    map.put("O", 90);
    mapTwo.put("XL", 40);
    map.put("P", 40);
    mapTwo.put("IX", 9);
    map.put("Q", 9);
    mapTwo.put("IV", 4);
    map.put("Y", 4);

    for (String key : mapTwo.keySet()) {
      if ("CM".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "F");
      }
      if ("CD".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "N");
      }
      if ("XC".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "O");
      }
      if ("XL".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "P");
      }
      if ("IX".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "Q");
      }
      if ("IV".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "Y");
      }
      if ("XCD".equals(key) && s.contains(key)) {
        s = s.replaceAll(key, "A");
      }
    }

    List<String> lis = Arrays.asList(s.split(""));
    int res = 0;
    for (String str : lis) {
      for (String key : map.keySet()) {
        if (str.equals(key)) {
          res += map.get(key);
        }
      }
    }

    return res;
  }
}
