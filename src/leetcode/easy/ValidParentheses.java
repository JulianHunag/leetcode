package leetcode.easy;

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

  public String replaceAll(String s) {
    s = s.replaceAll("\\{\\}", "");
    s = s.replaceAll("\\(\\)", "");
    s = s.replaceAll("\\[\\]", "");
    return s;
  }
}
