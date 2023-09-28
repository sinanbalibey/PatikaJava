package Donguler;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı Giriniz: ");
        int a=scan.nextInt();
        scan.close();
        int count=0;
        while (a>0){
            count+=a%10;
            a=a/10;
        }
        System.out.println(count);
    }
}
