package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintAllPermutations {
    String swap(String s, int i, int j){
        char[] temp = s.toCharArray();
        char c = temp[i];
        temp[i] = temp[j];
        temp[j] = c;
        return new String(temp);
    }
    void util(String s, int idx, Set<String> res){
        if(idx == s.length()){
            res.add(s);
            return;
        }
        for(int i=idx;i<s.length();i++){
            String swaped = swap(s,idx,i);
            util(swaped,idx+1,res);//String are immutable in java. So, s won't change for next iteration.
        }
    }
    public List<String> find_permutation(String s) {
        Set<String> res = new HashSet<>();// To avoid duplication.
        util(s, 0, res);
        List<String> result = new ArrayList<String>(res);
        Collections.sort(result);
        return result;
    }
}