package Donguler;

import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        boolean tekMi=true;
        int count=0;
        System.out.println("Sayı Giriniz");
        while (tekMi){
            int input=scan.nextInt();

            if(input%2==1){
                tekMi=false;
            }
            if(input%2==0&&input%4==0){
                count+=input;
            }
        }
        System.out.println("Toplam: "+count);
    }
}
