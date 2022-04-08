package cn.qqy.base.day0322;

/**
 * @author jxk
 * @date 2022/3/26 10:47
 */
public class Ass implements Inter1, Inter2 {
    public static void main(String[] args) {
        Ass ass = new Ass();
        ass.method();
    }


    @Override
    public void method() {
        Inter1.super.method();
    }
}
