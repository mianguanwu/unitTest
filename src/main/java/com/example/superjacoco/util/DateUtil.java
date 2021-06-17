package com.example.superjacoco.util;

public class DateUtil {
    public boolean isLeapYear(int year)
    {
        if((year>0&&year<=10000)&&((year%100!=0&&year%4==0)||(year%400==0)))
            return true;
        else return false;
    }

    public boolean isLeapYear1(int year)
    {
        if((year>0&&year<=10000)&&((year%100!=0&&year%4==0)||(year%400==0)))
            return true;
        else return false;
    }
}

