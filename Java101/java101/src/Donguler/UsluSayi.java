package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int a=scan.nextInt();
        System.out.print("Üs alınacak sayiyi giriniz: ");
        int b=scan.nextInt();
        int result=1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        System.out.println(result);
    }
}
