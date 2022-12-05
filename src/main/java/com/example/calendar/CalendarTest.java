package com.example.calendar;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

@Slf4j
public class CalendarTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");

        // 현재
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);

        // 해당월의 총 일수
        int daysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("현재: " + year + "년 " + (month + 1) + "월 " + date + "일 | 총 일수 " + daysOfMonth + "일");
        System.out.println("사용일수: " + date + " | 남은 일수: " + (daysOfMonth - date));

        System.out.println("================================");


        // 윤달있는 년 월
        cal.set(2024,2-1, 9);

        // 해당 월의 총 일수
        int daysOfMonth2 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int yundalDate = cal.get(Calendar.DATE);
        System.out.println("윤달: " + sdf.format(cal.getTime()) + " | 총 일수: " + daysOfMonth2);
        System.out.println("사용 일수: " + yundalDate + " | 남은 일수: " + (daysOfMonth2 - yundalDate) + "일");

    }


}
