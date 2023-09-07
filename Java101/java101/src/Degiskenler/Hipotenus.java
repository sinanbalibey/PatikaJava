package Degiskenler;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();


        double hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Hipotenus : "+hipotenus);
    }
}
