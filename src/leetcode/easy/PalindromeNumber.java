package leetcode.easy;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {

    if (x < 0) {
      return false;
    }

    int resInt = this.reverse(x);
    if (resInt == x) {
      return true;
    }

    return false;
  }

  public int reverse(int x) {
    String strx = String.valueOf(x);
    if (x < 0) {
      strx = strx.substring(1, strx.length());
    }
    char[] xArry = strx.toCharArray();
    String bufferx = "";
    for (int i = xArry.length - 1; 0 <= i && i < xArry.length; i--) {
      bufferx = bufferx + String.valueOf(xArry[i]);
    }
    long res = 0;
    if (x < 0) {
      res = -Long.valueOf(bufferx);
      if (res < Integer.MIN_VALUE) {
        return 0;
      }
      return Integer.valueOf(String.valueOf(res));
    }
    res = Long.valueOf(bufferx);
    if (res > Integer.MAX_VALUE) {
      return 0;
    }
    return Integer.valueOf(String.valueOf(res));
  }
}
