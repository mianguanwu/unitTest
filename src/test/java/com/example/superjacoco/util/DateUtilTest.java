package com.example.superjacoco.util;


import static org.junit.Assert.*;

class DateUtilTest {
    @org.junit.Test
    public void isLeapYear() {
        int[] arr = {-100, 1000, 20000, 2020, 2019, 2000, 1900};
        for (int i = 0; i < 7; ++i) {
            boolean check = false;
            if (i == 3 || i == 5)
                check = true;
            assertEquals(check, new DateUtil().isLeapYear(arr[i]));//省去Assert.
        }
    }

}