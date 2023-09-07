package Degiskenler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            byte a=Byte.MAX_VALUE;
            short b=Short.MAX_VALUE;
            System.out.println("max byte: "+a);
            System.out.println(b);

            float f=1;
            float f2=Float.MAX_VALUE;
            float f3=3.14f;
            System.out.println(f);
            System.out.println("max float: "+f2);
            System.out.println(f3);

            double d=Double.MAX_VALUE;
            System.out.println("max double: "+d);

            char c1='J';
            char c2='A';
            char c3='V';
            char c4='A';
            System.out.println(" "+c1+c2+c3+c4);

            int x=5;
            int y=5;
            System.out.println(x==y?1:0);

            Scanner scanner=new Scanner(System.in);

            int input=scanner.nextInt();
            System.out.println(input);



    }

}
