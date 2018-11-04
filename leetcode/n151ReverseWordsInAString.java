package leetcode;

import util.Print;

import java.util.ArrayList;
import java.util.Arrays;

public class n151ReverseWordsInAString {
    public static void main(String[] args) {
        n151ReverseWordsInAString t = new n151ReverseWordsInAString();
        String s = "asd    243  fdsf  rer   rewr rew";
//        String s = "the sky is blue";

        t.reverseWords(s);
//        t.reverseWords(s);
    }

    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int i=0;
        int start= 0;
        int len = 0;
        //排除前面的空格
        while (i<a.length && a[i] == ' ')i++;
        while (i<a.length){
            //把字符复制到a数组中
            while (i<a.length && a[i]!= ' ')a[start++] = a[i++];
            //单词结束,添加1个空格
            if (start<a.length)a[start++] = ' ';
            //说明没有多余的空格
            else len = start-1;
            //排除空格
            while (i<a.length && a[i] == ' ')i++;
        }
        //a数组的范围是[0,start-2]
        //如果是空字符串
        if (start == 0)return "";
        Print.print(a);
        len = start -1;
        swap(a,0,len);
        Print.print(a,0,start-1);
        //把每个单词翻转
        i = 0;int j=0;
        while (j<a.length){
            while (j<a.length && a[j]!= ' ')j++;
            swap(a,i,j-1);
            j = j+1;
            i = j;
        }
        Print.print(a,0,len+1);
        return Arrays.toString(a).substring(0,len+1);
    }


    private void swap(char[] c, int i, int j) {
        while (i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;j--;
        }
    }
}
