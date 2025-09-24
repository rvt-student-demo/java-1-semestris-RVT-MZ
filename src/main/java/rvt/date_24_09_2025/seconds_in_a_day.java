package rvt.date_24_09_2025;

import java.util.Scanner;

public class seconds_in_a_day {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Ievadi diennaktu skaitu");
        int num = Integer.valueOf(scn.nextLine());
        System.out.println("Atbilde: " +(num*86400)+" sec.");
    }
}
