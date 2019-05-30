package leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public boolean isAnagram(String s,String t){

        if(s.length()!=t.length()) return false;

        if(s.length()==0 && t.length()!=0 || s.length()!=0 && t.length()==0) return false;

        char[] schars = s.toCharArray();

        char[] tchars = t.toCharArray();

        Map<Character,Integer> smap = new HashMap<>();
        for(char sc : schars){
            if(smap.containsKey(sc)){
                smap.put(sc,smap.get(sc)+1);
            }
            else{
                smap.put(sc,1);
            }
        }

        Map<Character,Integer> tmap = new HashMap<>();
        for(char tc : tchars){
            if(tmap.containsKey(tc)){
                tmap.put(tc,tmap.get(tc)+1);
            }
            else{
                tmap.put(tc,1);
            }
        }


        return smap.equals(tmap);
    }

}
