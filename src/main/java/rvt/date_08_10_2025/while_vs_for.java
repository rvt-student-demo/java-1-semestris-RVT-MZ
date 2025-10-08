package rvt.date_08_10_2025;

public class while_vs_for {
    public static void while_example (String[] args) {
        int number = 1;
        while (number < 6) {
            System.out.println(number);
            number++; // vai var rakstīt arī šādi: number = number + 1;
         }
    }
    public static void for_example (String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}
