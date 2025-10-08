package rvt.date_08_10_2025;

import java.util.Scanner;

public class repeating_braking_remembering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dod numurus:");
        while (true) {
            int num = Integer.valueOf(scan.nextLine());
            if (num == -1) {
                System.out.println("Plds! Ata!");
                break;
            }
        }
    }
}
