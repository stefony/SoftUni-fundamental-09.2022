package com.company;

import java.util.Scanner;

public class eleventask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf(" %d X %d = %d%n",n,times, n*times);
            times++;
        }while (times<=10);
    }
}
