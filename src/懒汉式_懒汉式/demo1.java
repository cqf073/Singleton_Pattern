package 懒汉式_懒汉式;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/6/715:21
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class demo1 {
    private static demo1 d;
    private demo1(){

    }
    public static  demo1 getD(){
        //双重锁定
        if(d==null) {
            synchronized (demo.class){
                if (d == null) {
                    return new demo1();

                }
            }
        }
        return d;
    }
}
