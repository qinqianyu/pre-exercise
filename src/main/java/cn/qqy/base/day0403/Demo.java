package cn.qqy.base.day0403;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntFunction;

/**
 * @author jxk
 * @date 2022/4/3 10:47
 */
public class Demo {
    public static void main(String[] args) {

        Object[] obs = new Object[6];
        obs[0] = new Object();
        obs[1] = "55";
        System.out.println(Arrays.toString(obs));

        Class<? extends Object[]> aClass = obs.getClass();
        System.out.println(aClass);

    }


    static class Pack<T> {
        T data;

        public Pack(T data) throws InstantiationException, IllegalAccessException {
            this.data = (T) data.getClass().newInstance();
        }

        public Pack(Class<T> data) throws InstantiationException, IllegalAccessException {
            this.data = data.newInstance();
        }


    }

    @SuppressWarnings("unchecked")
    static class PackArr<T> {
        T[] datas;

        public PackArr(Class<T> clazz) {
            datas = (T[]) Array.newInstance(clazz, 10);
        }

        public PackArr(T... t) throws InstantiationException, IllegalAccessException {
            datas = (T[]) Array.newInstance(t.getClass().getComponentType(), t.length << 1);
        }
        public PackArr(IntFunction<T[]> function){
           datas = function.apply(10);
        }
    }

}