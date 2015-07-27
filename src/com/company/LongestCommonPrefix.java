package com.company;

/**
 * Created by emma on 16/6/15.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"ac","","a","a"};
        String t = longestCommonPrefix(s);
        System.out.println(t);
    }

    public static String longestCommonPrefix(String[] strs){
        StringBuffer prefix = new StringBuffer();
        if(strs.length == 0) return null; //doesn't work: if(strs==null) return null;
        if(strs.length == 1) return strs[0];
        for(int a=0, b=0; a<strs[0].length() && b<strs[1].length(); a++, b++){
            if(strs[0].charAt(a) == strs[1].charAt(b)) prefix.append(strs[0].charAt(a));
            else break;
        }
        for(int i=2; i<strs.length; i++){
            if(prefix.length()==0 || strs[i].length()==0) return "";
            for(int j=0; j<strs[i].length() && j<prefix.length(); j++) {
                if(strs[i].charAt(j) != prefix.charAt(j)) prefix.setLength(j);
                if(prefix.length() > strs[i].length()) prefix.setLength(strs[i].length());
            }
        }
        return prefix.toString();
    }
}

/*
public class Solution {
    public String longestCommonPrefix(List<String> strs) {
        if(strs.size()==0) return "";
        StringBuilder lcp=new StringBuilder();
        for(int i=0;i<strs.get(0).length();i++){
            char c=strs.get(0).charAt(i);
            for(String s:strs){
                if(s.length()<i+1||c!=s.charAt(i)) return lcp.toString();
            }
            lcp.append(c);
        }
        return lcp.toString();
    }
}
 */
/*
public String longestCommonPrefix(String[] strs) {
    if(strs == null || strs.length == 0)    return "";
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++)
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0,pre.length()-1);
    return pre;
}
 */