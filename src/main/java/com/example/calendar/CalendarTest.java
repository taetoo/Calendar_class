package com.example.calendar;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

@Slf4j
public class CalendarTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 ");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 d일 ");


        // 현재
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String korDayOfWeek = "";
        korDayOfWeek = getYoil(korDayOfWeek, dayOfWeek);

        // 해당월의 총 일수
        int daysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("= 중도입주 일할계산 Test =\n");
        System.out.println("현재: " + year + "년 " + (month + 1) + "월 " + date + "일 " + korDayOfWeek +"요일 | 총 일수 " + daysOfMonth + "일");
        System.out.println("거주 일수: " + date + " | 남은 일수: " + (daysOfMonth - date) +"\n");


        System.out.println("================================\n");


        // 윤달있는 년 월
        cal.set(2020,2-1, 2);

        // 해당 월의 총 일수
        int daysOfMonth2 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int yundalDate = cal.get(Calendar.DATE);
        int dayOfWeek2 = cal.get(Calendar.DAY_OF_WEEK);
        korDayOfWeek = getYoil(korDayOfWeek, dayOfWeek2);

        System.out.println("윤달: " + sdf.format(cal.getTime()) + korDayOfWeek + "요일 | 총 일수 " + daysOfMonth2);
        System.out.println("거주 일수: " + yundalDate + " | 남은 일수: " + (daysOfMonth2 - yundalDate) + "일");



        // Notyet Test
        System.out.println("\n================================\n");
        System.out.println("임의 날짜 테스트");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        cal.set(Calendar.YEAR, a);
        cal.set(Calendar.MONTH, b-1);
        cal.set(Calendar.DATE, c);
        int daysOfMonth3 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dayOfWeek3 = cal.get(Calendar.DAY_OF_WEEK);
        int testDate = cal.get(Calendar.DATE);
        korDayOfWeek = getYoil(korDayOfWeek, dayOfWeek3);
        System.out.println( sdf2.format(cal.getTime()) + korDayOfWeek + "요일" + " | 총 일수 " + daysOfMonth3);
        System.out.println("거주 일수: " + testDate + " | 남은 일수: " + (daysOfMonth3 - testDate));

    }

    private static String getYoil(String korDayOfWeek, int dayOfWeek2) {
        switch (dayOfWeek2){
            case 1:
                korDayOfWeek = "일";
                break;
            case 2:
                korDayOfWeek = "월";
                break;
            case 3:
                korDayOfWeek = "화";
                break;
            case 4:
                korDayOfWeek = "수";
                break;
            case 5:
                korDayOfWeek = "목";
                break;
            case 6:
                korDayOfWeek = "금";
                break;
            case 7:
                korDayOfWeek = "토";
                break;

        }
        return korDayOfWeek;
    }


}
