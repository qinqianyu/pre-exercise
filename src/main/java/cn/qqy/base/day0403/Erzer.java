package cn.qqy.base.day0403;

import java.util.List;

/**
 * @author jxk
 * @date 2022/4/4 3:14
 */
public class Erzer <T>{
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public  <D extends List<Integer>> D show(D cache){
        return cache;

    }
}
