package KosulluIfadeler;

import java.util.Scanner;

public class Sirala {

    public static void main(String[] args) {
        int a,b,c;

        Scanner scan=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a=scan.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        b=scan.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        c=scan.nextInt();

        if(a>b&&a>c){
            //a
            if(b>c)
                System.out.println(c+" "+b+" "+a);
            else
                System.out.println(b+" "+c+" "+a);
        }else if(b>a&&b>c){
            //b
            if(a>c)
                System.out.println(c+" "+ a+" "+b);
            else
                System.out.println(a+" "+c+" "+b);
        }else if(c>a&&c>b){
            //c
            if(a>b)
                System.out.println(b+" "+a+" "+c);
            else
                System.out.println(a+" "+b+" "+c);
        }

    }

}
