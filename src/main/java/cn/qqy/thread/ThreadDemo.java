package cn.qqy.thread;

import java.util.concurrent.FutureTask;

/**
 * @author jxk
 * @date 2022/4/4 17:54
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //method1();

        method2();
        method2();

    }

    private static void method2() {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(stringFutureTask);
        thread.start();

    }

    private static void method1() {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
