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
public class demo {
    private static demo d= new demo();
    private demo(){

    }
    public static demo getD(){
        return d;
    }
}
