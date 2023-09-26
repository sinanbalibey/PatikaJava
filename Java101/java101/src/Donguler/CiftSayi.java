package Donguler;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen pozitif bir sayı giriniz :");

        int input=scan.nextInt();
        int count=0;
        for(int i=0;i<input;i++){
            if(i%3==0&&i%4==0){
                count+=i;
            }
        }
        System.out.println("Toplamı: "+count);
    }
}
