package Degiskenler;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
//18/100
        Scanner scan=new Scanner(System.in);

        double fiyat=scan.nextDouble();
        double kdv=0.18;
        double kdv2=0.8;
        System.out.println("KDV'siz Fiyat : "+fiyat);
        System.out.println("KDV Oranı : "+(fiyat>0&&fiyat<1000?kdv:kdv2));
        System.out.println("KDV Tutarı : "+(fiyat>0&&fiyat<1000?fiyat*kdv:fiyat*kdv2));
        System.out.println("KDV'li Fiyat : "+(fiyat>0&&fiyat<1000?(fiyat+fiyat*kdv) :(fiyat+fiyat*kdv2)));
    }
}
