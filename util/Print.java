package util;

public class Print {
    public static void print(char[] a){
        for (char x : a){
            System.out.print(x);
        }
        System.out.println();
    }

    public static void print(int[] a){
        for (int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void print(boolean[] a){
        for (boolean x : a){
            if (x)
            System.out.print("t ");
            else
            System.out.print("f ");
        }
        System.out.println();
    }

    public static void print(char[] a,int i,int j){
        for (;i<j;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
