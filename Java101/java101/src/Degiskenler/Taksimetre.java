package Degiskenler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Gideceğiniz km'yi yazınız");
        int km=scan.nextInt();
        double tutar=km*2.20+10;
        System.out.println("Toplam Tutar: "+(tutar<20?20:tutar));
    }
}
