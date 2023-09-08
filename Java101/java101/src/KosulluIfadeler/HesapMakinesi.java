package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 1. sayıyı giriniz");
        int a=scan.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz");
        int b=scan.nextInt();

        System.out.println("Lütfen hangi işlemi yapmak istediğinizi tuşlayın");
        System.out.println(" 1: Toplama \n 2: Çıkarma \n 3: Çarpma \n 4: Bölme");

        int secilen=scan.nextInt();
        double sonuc=0;
        switch (secilen){

            case 1:
                sonuc=a+b;
                System.out.println(sonuc);
                break;

            case 2:
                sonuc=a-b;
                System.out.println(sonuc);
                break;

            case 3:
                sonuc=a*b;
                System.out.println(sonuc);
                break;

            case 4:
                sonuc=a/b;
                System.out.println(sonuc);
                break;

            default:
                System.out.println("Hatalı Tuşlama Yaptınız");
        }
    }
}
