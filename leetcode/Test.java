package leetcode;

public class Test {

    //静态方法比实例方法运行速度更快，因为实例方法需要建立虚拟函数导向表
    public static void main(String[] args) {
        Test t = new Test();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            staticMethod();
//            t.instanceMethod();
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);


    }

    public  static void staticMethod(){

    }

    public   void instanceMethod(){

    }
}
