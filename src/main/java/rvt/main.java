package rvt;

import java.util.Scanner;

import rvt.date_13_11_2025.Statistics;

public class main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        Scanner scan = new Scanner(System.in);
        while (true) { 
            int num = Integer.valueOf(scan.nextLine());
            if (num == -1) {
                break;
            } else {
                statistics.addNumber(num);
                if (num % 2 == 0) {
                    evenStatistics.addNumber(num);
                } else {
                    oddStatistics.addNumber(num);
                }
            }
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: "+evenStatistics.sum());
        System.out.println("Sum of odd numbers: "+oddStatistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
