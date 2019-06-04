package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateOneByOne("",result,n,n);
        return result;
    }

    public void generateOneByOne(String sublist,List<String> result, int left, int right) {

        if(left == 0 && right == 0){
            result.add(sublist);
            return;
        }

        if(left > 0){
            generateOneByOne(sublist+"(",result,left-1,right);
        }

        if(right>left){
            generateOneByOne(sublist+")",result,left,right-1);
        }
    }


    public static void main(String[] args) {
        GenerateParentheses p = new GenerateParentheses();
        System.out.println(p.generateParenthesis(4).size());
    }

}
