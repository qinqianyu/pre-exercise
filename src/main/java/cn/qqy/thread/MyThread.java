package cn.qqy.thread;

/**
 * @author jxk
 * @date 2022/4/4 17:51
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
