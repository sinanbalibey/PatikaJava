package Donguler;

import java.util.Scanner;

public class GirilenSayi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz :");
        int input=scan.nextInt();

        for(int i=1;i<input;i++){
            if(i%4==0&&i%5==0){
                System.out.println(i);
            }
        }

    }
}
