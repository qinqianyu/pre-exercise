package cn.qqy.base.day0404;

import java.lang.reflect.Array;

/**
 * @author jxk
 * @date 2022/4/4 4:23
 */
public class Frute<T> {
    private T[] arr;

    public  Frute(Class<T> cla, Integer length) {
        arr = (T[])Array.newInstance(cla, length);
    }
}
