package KosulluIfadeler;

import java.util.Scanner;

public class BurcHesapla {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Doğum Ayınızı giriniz: ");
        int ay=scan.nextInt();

        System.out.print("Doğum Gününüzü Giriniz: ");
        int gün =scan.nextInt();

        if(ay==1||ay==12&&gün>=22||gün<=21)
            System.out.println("Oğlak Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Kova Burcusun");
        else if((ay==2||ay==3)&&(gün>=22||gün<=19))
            System.out.println("Balık Burcusun");
        else if((ay==3||ay==4)&&(gün>=21||gün<=20))
            System.out.println("Koç  Burcusun");
        else if((ay==4||ay==5)&&(gün>=21||gün<=21))
            System.out.println("Boğa  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("İkizler  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Yengeç  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Aslan  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Başak  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Terazi  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Akrep  Burcusun");
        else if((ay==1||ay==2)&&(gün>=22||gün<=19))
            System.out.println("Yay  Burcusun");


    }
}
