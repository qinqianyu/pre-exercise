package cn.qqy.base.day0328;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 * @author jxk
 * @date 2022/3/28 21:37
 */
public class Demo {
    public static void main(String[] args) {


        method();
        ArrayList<String> list = new ArrayList<>();

        HashSet<String> strings = new HashSet<>();

    }

    public static void method() {
      /*  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        TemporalAccessor parse = formatter.parse("20220328");*/
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            Date parse = simpleDateFormat.parse("20220328");
        } catch (ParseException e) {
            throw new RuntimeException("ss");
        }
    }
}
