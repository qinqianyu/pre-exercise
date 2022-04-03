package cn.qqy.day0328;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
