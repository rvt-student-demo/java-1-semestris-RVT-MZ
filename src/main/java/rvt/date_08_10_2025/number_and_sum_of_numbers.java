package rvt.date_08_10_2025;

import java.util.Scanner;

public class number_and_sum_of_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int quat = 0;
        while (true) {
            System.out.println("Ievadi skaitli: ");
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                break;
            }
            sum = sum + num;
            quat = quat + 1;
        }
        System.out.println("Reizes bija: " + quat);
        System.out.println("Summa ir " + sum);
    }
}
