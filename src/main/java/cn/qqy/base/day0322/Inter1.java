package cn.qqy.base.day0322;

/**
 * @author jxk
 * @date 2022/3/26 10:45
 */
public interface Inter1 {


    default void method(){
        System.out.println("111");
    }

    public static void SS(){
        new Object();
        System.out.println("ssss");
    }
}
