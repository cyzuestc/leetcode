package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class n127WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> beginSet = new HashSet();
        Set<String> endSet = new HashSet<>();

        int len = 1;
        HashSet<String> visited = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()){
            if (beginSet.size()>endSet.size()){
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }
            Set<String> temp = new HashSet<>();
            for (String word : beginSet){
                char[] chs = word.toCharArray();

                for (int i = 0; i < chs.length; i++) {
                    char old = chs[i];
                    for (char c = 'a';c<='z';c++){
                        chs[i] = c;
                        String target = String.valueOf(chs);
                        if (endSet.contains(target) && wordList.contains(target)  ){
                            return len+1;
                        }
                        if (!visited.contains(target) && wordList.contains(target)){
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }
                }
            }
            beginSet = temp;
            len++;
        }
        return 0;
    }


}
