package rvt.date_24_09_2025;

import java.util.Scanner;

public class multiplication_formula {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Ievadi pirmo numuru: ");
        int first = Integer.valueOf(scn.nextLine());
        System.out.println("Ievadi otro numuru: ");
        int second = Integer.valueOf(scn.nextLine());
        int atb = first*second;
        System.out.println(first+" * "+second+" = "+atb);        
    }
}
