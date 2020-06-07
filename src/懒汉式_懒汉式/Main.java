package 懒汉式_懒汉式;

public class Main {

    public static void main(String[] args) {
        //懒汉式&懒汉式DCL
       demo d1= demo.getD();
       demo d2= demo.getD();
       System.out.println(d1);
       System.out.println(d2);
        //不同的模式new对象
       demo dd =demo.getD();
       demo1 ddd = demo1.getD();
        System.out.println(dd);
        System.out.println(ddd);

    }
}
