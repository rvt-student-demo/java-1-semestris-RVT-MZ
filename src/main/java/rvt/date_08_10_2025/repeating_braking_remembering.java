package rvt.date_08_10_2025;

import java.util.Scanner;

public class repeating_braking_remembering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dod numurus:");
        int sum = 0;
        int quat = 0;
        int para = 0;
        int nepara = 0;
        while (true) {
            int num = Integer.valueOf(scan.nextLine());
            if (num == -1) {
                System.out.println("Plds! Ata!");
                break;
            } else if (num % 2 == 0) {
                para++;
            } else {
                nepara++;
            }
            sum = sum + num;
            quat++;
        }
        System.out.println("Summa ir " + sum);
        System.out.println("Reizes bija: " + quat);
        System.out.println("Videjais ir: " + (sum / (double) quat));
        System.out.println("Para: " + para);
        System.out.println("Nepara: " + nepara);
    }
}
