package rvt.date_24_09_2025;

import java.util.Scanner;

public class average_of_three_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ievadi pirmo numuru: ");
        double first = Double.valueOf(scn.nextLine());
        System.out.println("Ievadi otro numuru: ");
        double second = Double.valueOf(scn.nextLine());
        System.out.println("Ievadi treso numuru");
        double third = Double.valueOf(scn.nextLine());
        System.out.println("Atbilde: "+((first+second+third)/3.0));
    }
}
