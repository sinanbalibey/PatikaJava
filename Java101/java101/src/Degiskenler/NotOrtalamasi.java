package Degiskenler;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        int math=scan.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        int fizik=scan.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        int kimya=scan.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz: ");
        int turkce=scan.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        int tarih=scan.nextInt();

        System.out.println("Müzik Notunuzu Giriniz: ");
        int muzik=scan.nextInt();

        double ortalama=(muzik+tarih+turkce+kimya+fizik+math)/6;

        System.out.println(ortalama>60?"Sınıfı Geçti":"Sınıfta Kaldı");
        System.out.println("Ortalamanız: "+ortalama);
    }
}
