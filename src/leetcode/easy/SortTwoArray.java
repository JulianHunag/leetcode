package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class SortTwoArray {

  public int[] sort(int[] a, int[] b) {
    int[] c = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] > b[j]) { 
        c[k] = b[j]; //取b中小的那个值给c[k]
        k++;
        j++;
      } else {
        c[k] = a[i];//取a中小的那个值给c[k]
        k++;
        i++;
      }
    }

    while (j < b.length) { // 如果b数组没有遍历完全
      c[k] = b[j];
      k++;
      j++;
    }

    while (i < a.length) {// 如果a数组没有遍历完全
      c[k] = a[i];
      k++;
      i++;
    }


    return c;
  }

  public static void main(String[] args) {

    int[] a = new int[] {4, 6, 7};
    int[] b = new int[] {6, 3, 5};
    int[] c = new SortTwoArray().sort(a, b);

    for (int k : c) {
      System.out.print(k + ",");
    }
    
    Set<Integer> set =  new SortTwoArray().findSame(a, b);
    for(Integer s:set){
      System.out.println();
      System.out.println(s);
    }
    

  }
  
  
  public Set<Integer> findSame(int[] a, int[] b){
    Set<Integer> set = new HashSet<Integer>();
    for(int inta:a){
      for(int intb :b){
        if(inta==intb){
          set.add(inta);
        }
      }
    }
    return set;
  }

  
}
