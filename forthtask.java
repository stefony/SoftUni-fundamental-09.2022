package com.company;

import java.util.Scanner;

public class forthtask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHour = Integer.parseInt(scanner.nextLine());
        int initialMinute = Integer.parseInt(scanner.nextLine());

        int allMinute = (initialHour*60)+initialMinute+30;
        int hour = allMinute/60;
        int minute = allMinute%60;

        if (hour>23){
           hour=0;
        }
        System.out.printf("%d:%02d",hour,minute);

    }
}
