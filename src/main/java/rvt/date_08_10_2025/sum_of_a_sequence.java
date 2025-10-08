package rvt.date_08_10_2025;

import java.util.Scanner;

public class sum_of_a_sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Ievadi pedeju skaitli: ");
        int last_num = Integer.valueOf(scan.nextLine());
        for (int i = 1; i <= last_num; i++) {
            sum = sum + i;
        }
        System.out.println("Summa ir " + sum);
    }
}
