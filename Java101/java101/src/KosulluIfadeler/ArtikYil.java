package KosulluIfadeler;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year=scan.nextInt();


        if(year%100==0){
            if(year%400==0){
                System.out.println(year+" bir artık yıldır!");
            }else {
                System.out.println(year+" bir artık yıl değildir!");
            }
        }
        else if(year%4==0){
            System.out.println(year+" bir artık yıldır!");
        }else {
            System.out.println(year+" bir artık yıl değildir!");
        }
    }
}
