package cn.qqy.base.day0316;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
