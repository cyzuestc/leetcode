package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordBreak2 {
    public ArrayList<String> wordBreak(String s, Set<String> dict) {

        return null;
    }

    public List<String> DFS(String s,Set<String> dict){
        ArrayList<String> temp = new ArrayList<>();
        for (String dictString : dict){
            if (s.startsWith(dictString)){
                DFS(s.substring(dictString.length()),dict);
            }
        }
        return null;
    }
}
