package leetcode.map;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){

        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        Map<Integer,Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
           map.put(-nums[i],i);
        }

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                int key = nums[i] + nums[j];
                if(map.containsKey(key)){
                    int k = map.get(key);
                    if (k != i && k != j) {
                        List<Integer> res = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(res);
                        result.add(res);
                    }
                }
            }
        }
        return new ArrayList(result);

    }


    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        System.out.println(t.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }


}
