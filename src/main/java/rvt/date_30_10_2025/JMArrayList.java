package rvt.date_30_10_2025;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        //onlyTheseNumbers();
        //listSize();
        //onTheList();
        removeLast();
    }
    public static void onlyTheseNumbers() {
        Scanner scan = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.parseInt(scan.nextLine());
            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }
        System.out.print("From where?: ");
        int from = Integer.parseInt(scan.nextLine());
        System.out.print("To where?: ");
        @SuppressWarnings("UnnecessaryTemporaryOnConversionFromString")
        int to = Integer.valueOf(scan.nextLine());

        for (int index = from; index <= to; index++) {
            System.out.println(list.get(index));
        }

    }
    public static void listSize() {
        Scanner scan = new Scanner (System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; true; i++) {
            String name = String.valueOf(scan.nextLine());
            if (name=="") {
                System.out.println("In total: "+ i);
                break;
            } else {
                names.add(name);
            }
        }
   
    }
    public static void onTheList() {
        Scanner scan = new Scanner (System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; true; i++) {
            String name = String.valueOf(scan.nextLine());
            if (name=="") {
                System.out.print("Search for: ");
                String search = String.valueOf(scan.nextLine());
                if (names.contains(search)){
                    System.out.println(search+" was found!");
                } else {
                    System.out.println(search+" was not found!");
                }
                break;
            } else {
                names.add(name);
            }
        }
    }
    public static void removeLast() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        strings.removeLast();
        strings.removeLast();

        System.out.println(strings);
    }
}
