package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class n139WordBreak {
    public static void main(String[] args) {
        n139WordBreak t = new n139WordBreak();
        t.wordBreak("1234567",new ArrayList<>());
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null||wordDict == null)return false;
        boolean[] flag = new boolean[s.length()+1];
        flag[0]=true;
        Set<String> dict =new HashSet<>();
        int maxLen = 0;
        for (String eachString :wordDict){
            maxLen = Math.max(eachString.length(),maxLen);
            dict.add(eachString);
        }
        for (int i = 0; i < s.length(); i++) {
            if (flag[i]){
                for (int j = i+1; j <= i+maxLen && j<=s.length(); j++) {
                    if (dict.contains(s.substring(i,j)))flag[j] = true;
                }
            }
        }
        return flag[s.length()];
    }
}
