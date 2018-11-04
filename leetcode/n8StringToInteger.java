package leetcode;

public class n8StringToInteger {
    public int myAtoi(String str) {
        int i = 0;

        int result = 0;
        //true 为正
        boolean sign = true;
        //去掉空格
        while (i < str.length() && str.charAt(i) == ' ') i++;
        //去掉符号位
        if (i < str.length()) {
            if (str.charAt(i) == '+')
                i++;
            else if (str.charAt(i) == '-') {
                sign = false;
                i++;
            }
        }
        if (i<str.length()){
            //首位不是数字
            if (str.charAt(i)>'9' || str.charAt(i)<'0')return result;
            else {
            int start = i;
            int end = i;
            while (end < str.length() && str.charAt(end)>='0' &&str.charAt(end)<='9')
                end++;
            long l = Long.parseLong(str.substring(start,end));
            if (l>Integer.MAX_VALUE){
                if (sign)return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            return (int) l;
        }
    }
    return result;
    }
}
