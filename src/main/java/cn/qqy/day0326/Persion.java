package cn.qqy.day0326;

/**
 * @author jxk
 * @date 2022/3/26 11:17
 */
public class Persion {
    public Integer id;
    public String name;

    public Persion() {
        System.out.println("0");
    }

    public Persion(Integer id) {
        System.out.println("1");
        this.id = id;
    }
}
