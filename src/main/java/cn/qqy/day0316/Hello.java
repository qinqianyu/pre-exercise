package cn.qqy.day0316;

import cn.qqy.day0322.Inter1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {

        BigDecimal decimal = new BigDecimal("10");
        BigDecimal decimal1 = new BigDecimal("3");
        BigDecimal divide = decimal.divide(decimal1, 2, RoundingMode.UP);


    }

    interface Inter {
        int num = 10;

        void method();
    }
}
