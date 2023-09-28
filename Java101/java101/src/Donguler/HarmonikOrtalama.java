package Donguler;

import java.util.Scanner;

public class HarmonikOrtalama {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int a=scan.nextInt();
        double count=0;
        for(int i=1;i<=a;i++){
            count+=(1.0/i);
        }
        System.out.println(count);
    }
}
