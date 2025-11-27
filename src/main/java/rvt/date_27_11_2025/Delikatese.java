package rvt.date_27_11_2025;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        double delivery=0;
        Scanner scan=new Scanner (System.in);
        System.out.print("Ievadi preci: ");
        String name=String.valueOf(scan.nextLine());
        System.out.print("Ievadi cenu: ");
        double price=Double.valueOf(scan.nextLine());
        System.out.print("Ekspress piegāde (0=NĒ, 1=JĀ): ");
        int expressDeliveryChoice=Integer.valueOf(scan.nextLine());

        if (price<10) {
            delivery+=2;
        }
        if (expressDeliveryChoice==1) {
            delivery+=3;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Rēķins: ");
        System.out.println(name+" - "+price);
        System.out.println("Piegāde - "+delivery);
        System.out.println("Kopā - "+(price+delivery));

    }
}
