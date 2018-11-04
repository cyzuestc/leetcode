package leetcode;

import java.util.ArrayList;
import java.util.List;

public class n890FindAndReplacePattern {
    public static void main(String[] args) {
        char[] map = new char[10];
        System.out.println(map[0]==map[1]);
    }
//    public List<String> findAndReplacePattern(String[] words, String pattern) {
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            if (help(words[i],pattern) && help(pattern,words[i]))list.add(words[i]);
//        }
//        return list;
//    }

//    public boolean help(String a,String b){
//        char[] map = new char[200];
//        for (int i = 0; i < a.length(); i++) {
//            char cA = a.charAt(i);
//            char cB = b.charAt(i);
//            if (map[cA]=='')map[cA] = cB;
//            else if( map[cA] != cB)return false;
//        }
//        return true;
//    }
}
