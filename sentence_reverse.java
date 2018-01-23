import java.util.ArrayList;

public class sentence_reverse {
    public static void main(String[] args) {
        String s = "hello xiao mi";
        StringBuilder sb = new StringBuilder();
        ArrayList list = new ArrayList();
        String[] res =  s.split(" ");
        for (int i = res.length-1; i >= 0; i--) {
            sb.append(res[i]);
            sb.append(" ");
        }
        System.out.printf(sb.substring(0,sb.length()-1).toString());
    }
}
