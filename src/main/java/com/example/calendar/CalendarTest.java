package com.example.calendar;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Slf4j
public class CalendarTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 | 총 일수 d일");

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int ilsu = cal.get(Calendar.DAY_OF_MONTH);

        // 현재
        System.out.println("현재: " + year + "년 " + (month + 1) + "월 " + date + "일 | 총 일수 " + ilsu + "일");

        // 11월
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, 11 -1);
        cal.set(Calendar.DATE, 10);
        cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("20221110 : "  + sdf.format(cal.getTime()));

        // 10월
        cal.set(2022, 10 -1, 20);
        cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("20221010 : " + sdf.format(cal.getTime()));

        System.out.println("");
        System.out.println("============윤달=============");
        // 윤달있는 년 월
        cal.set(2016, 2, 0);
        cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(sdf.format(cal.getTime()));

    }


}
