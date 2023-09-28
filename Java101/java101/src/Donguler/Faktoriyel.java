package Donguler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Faktoriyeli Hesaplanacak sayıyı giriniz: ");
        int input=scan.nextInt();
        int count=1;
       for(int i=1;i<=input;i++){
           count=count*i;
       }
        System.out.println(count);
       scan.close();
    }
}
