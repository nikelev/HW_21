package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
//        double a = 10;
//        int[] arr = new int[10];
//        System.out.println(arr);
        Computer[] shop = new Computer[5];
//        System.out.println(shop);
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        //shop[0].setRam(24);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon 8", 8, 128, "Pixel", 10, 0.18, 2534453625L);
        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total SSD =" + total);

        Laptop laptop1 = (Laptop) shop[1];
        laptop1.setHours(4.5);
        System.out.println(laptop1);

        System.out.println("=====================Homework_Task1========================");

        double totalHoursLaptop = getTotalHoursLaptop(shop);
        double totalHoursSmart = getTotalHoursSmart(shop);
        System.out.println(totalHoursLaptop);
        System.out.println(totalHoursSmart);

        System.out.println(totalHoursLaptop + totalHoursSmart);

    }

    public static double getTotalHoursLaptop(Computer[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i] instanceof Laptop) {
                    arr[i] = (Laptop) arr[i];
                    res += ((Laptop) arr[i]).getHours();
                }

            }
        }
        return res;
    }

    public static double getTotalHoursSmart(Computer[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                if (arr[i] instanceof Smartphone) {
                    arr[i] = (Smartphone) arr[i];
                    res += ((Smartphone) arr[i]).getHours();
                }
            }

        }
        return res;
    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }


    public static int getTotalSSDCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSsd();
            }
        }
        return res;
    }
}