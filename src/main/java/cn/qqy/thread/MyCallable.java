package cn.qqy.thread;

import java.util.concurrent.Callable;

/**
 * @author jxk
 * @date 2022/4/4 18:10
 */
public class MyCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call()  {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        return "完成";
    }
}
