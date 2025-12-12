package rvt.date_27_11_2025;

import java.util.Scanner;

public class chapter44 {
    public static void main(String[] args) {
        //uzd1();
        //uzd2();
        //uzd3();
        //uzd4();
        //uzd5();
        uzd6();
        //uzd7();
    }
    public static void uzd1() {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String fullnameInput=String.valueOf(scan.nextLine());
        String[] fullname = fullnameInput.split(" ");
        System.out.println(fullname[0]+" "+fullname[1].toUpperCase());
    }
    public static void uzd2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String word = String.valueOf(scan.nextLine());
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
    public static void uzd3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an name: ");
        String fullnameInput = String.valueOf(scan.nextLine());
        String[] fullname = fullnameInput.split(" ");
        if (fullname[0].equals("Amy") || fullname[0].equals("Buffy") || fullname[0].equals("Cathy")) {
            System.out.println("Ms. "+fullname[0]+" "+fullname[1]);
        } else if (fullname[0].equals("Elroy") || fullname[0].equals("Fred") || fullname[0].equals("Graham")) {
            System.out.println("Mr. "+fullname[0]+" "+fullname[1]);
        } else {
            System.out.println(fullname[0]+" "+fullname[1]);
        }
        
    }
    public static void uzd4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter cook time: ");
        String cookTime = String.valueOf(scan.nextLine());
        if (cookTime.length() == 2) {
            System.out.println("0:"+cookTime);
        } else {
            System.out.println(cookTime.substring(0,cookTime.length()-2)+":"+cookTime.substring(cookTime.length()-2));
        }
    }
    public static void uzd5() {}
    public static void uzd6() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String passw = String.valueOf(scan.nextLine());
        if (passw.length() >= 7 && passw.equals(passw.toLowerCase()) && passw.equals(passw.toUpperCase())) { //??????
            System.out.println("Acceptable password.");
        } else {
            System.out.println("That password is not acceptable.");
        }
    }
    public static void uzd7() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an string: ");
    String word = String.valueOf(scan.nextLine());
        
    }
}