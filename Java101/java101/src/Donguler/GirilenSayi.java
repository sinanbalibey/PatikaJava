package Donguler;

import java.util.Scanner;

public class GirilenSayi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz :");
        int input=scan.nextInt();

        for(int i=0;i<input;i++){
            if(input%4==0&&input%5==0){
                System.out.println(input);
            }
        }

    }
}
