package com.example;

import java.util.Scanner;

import com.example.common.Month;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a month, typed in all Capital letters: ");

        String userinput = scanner.nextLine();

        List<String> monthList = new ArrayList<>();
        monthList.add(userinput);

        switch (userinput) {
            case "JANUARY":
                monthList.add(Month.JANUARY.getEnglishName());
            case "FEBRUARY":
                monthList.add(Month.FEBRUARY.getEnglishName());
            case "MARCH":
                monthList.add(Month.MARCH.getEnglishName());
            case "APRIL":
                monthList.add(Month.APRIL.getEnglishName());
            case "MAY":
                monthList.add(Month.MAY.getEnglishName());
            case "JUNE":
                monthList.add(Month.JUNE.getEnglishName());
            case "JULY":
                monthList.add(Month.JULY.getEnglishName());
            case "AUGUST":
                monthList.add(Month.AUGUST.getEnglishName());
            case "SEPTEMBER":
                monthList.add(Month.SEPTEMBER.getEnglishName());
            case "OCTOBER":
                monthList.add(Month.OCTOBER.getEnglishName());
            case "NOVEMBER":
                monthList.add(Month.NOVEMBER.getEnglishName());
            case "DECEMBER":
                monthList.add(Month.DECEMBER.getEnglishName());
                break;
            default:
                System.out.println(userinput + " is not a month");
        }
        for (String monthName : monthList) {
            System.out.println(monthName);
        }
    }


}
