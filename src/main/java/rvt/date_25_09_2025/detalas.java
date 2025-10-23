package rvt.date_25_09_2025;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int price_skruve=5;
        int price_uzgriezne=3;
        int price_paplaksne=1;
        System.out.println("Ievadiet skruvu daudzumu (1 skruve = 5 cents):");
        int quantity_skruve = Integer.valueOf(scn.nextLine());
        System.out.println("Ievadiet uzgrieznu daudzumu (1 uzgriezne = 3 cents):");
        int quantity_uzgriezne = Integer.valueOf(scn.nextLine());
        System.out.println("Ievadiet paplaksne daudzumu (1 paplaksne = 1 cents):");
        int quantity_paplaksne = Integer.valueOf(scn.nextLine());
        if (quantity_uzgriezne != quantity_skruve){
            System.out.println("Parbaudi pasultijumi: par maz uzgrieznu");
        } else if (quantity_skruve!=(2*quantity_paplaksne)) {
            System.out.println("Parbaudi pasultijumi: par maz paplaksnu");
        } else {
            System.out.println("Pasultijums ir kartiba!");
        };
        System.out.println("Kopeja cena: "+(price_skruve*quantity_skruve+price_uzgriezne*quantity_uzgriezne+price_paplaksne*quantity_paplaksne));
    }
}