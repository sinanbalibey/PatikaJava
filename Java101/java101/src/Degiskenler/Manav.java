package Degiskenler;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz =0.95;
        double patlican=5.00;

        Scanner scan=new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? :");
        int alinanArmut=scan.nextInt();

        System.out.print("Elma Kaç kilo ? :");
        int alinanElma=scan.nextInt();

        System.out.print("Domates Kaç kilo ? :");
        int alinanDomates=scan.nextInt();

        System.out.print("Muz Kaç kilo ? :");
        int alinanMuz=scan.nextInt();

        System.out.print("Patlcan  Kaç kilo ? :");
        int alinanPatlican=scan.nextInt();

        double tutar=alinanArmut*armut+alinanDomates*domates+alinanElma*elma+alinanMuz*muz+alinanPatlican*patlican;
        System.out.println("Toplam tutar: "+tutar);
    }
}
