package KosulluIfadeler;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        //1km ==> 0.1
        Scanner scan=new Scanner(System.in);
        double tutar=0;
        System.out.print("Mesafeyi km türünden giriniz: ");
        int km=scan.nextInt();



        tutar=km*0.1;

        System.out.print("Yasınızı giriniz: ");
        int yas=scan.nextInt();
        if(yas>=0&&yas<12){
            tutar=tutar-tutar*0.5;

        }
        else if(yas>=12&&yas<24){
            tutar=tutar-tutar*0.1;

        }
        else if(yas>65){
            tutar=tutar-tutar*0.3;

        }
        System.out.print("Yolculuk tipinizi giriniz(1=> Tek Yön, 2=> Gidiş Dönüş): ");
        int secim=scan.nextInt();
        if(secim==1){
            System.out.println("Toplam Tutar: "+tutar);
        }else if(secim==2){
            tutar=tutar-tutar*0.2;
            tutar=tutar*2;
            System.out.println("Toplam Tutar: "+tutar);
        }else if(tutar<=0){
            System.out.println("Hatalı Veri Girdiniz");
        }


    }
}
