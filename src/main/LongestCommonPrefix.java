package main;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            String newPrefix = "";
            int j=0;
            while(j<prefix.length() && j<strs[i].length()){
                if(prefix.charAt(j) == (strs[i].charAt(j)))
                    newPrefix += prefix.charAt(j);
                else
                    break;
                j++;
            }
            prefix = newPrefix;
        }
        return prefix;
    }
}