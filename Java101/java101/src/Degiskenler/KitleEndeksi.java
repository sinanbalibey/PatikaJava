package Degiskenler;

import java.util.Scanner;

public class KitleEndeksi {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy=scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        double kilo=scan.nextDouble();

        System.out.println("Vücut Kitle İndeksiniz :"+(kilo/(boy*boy)));


    }
}
