package Degiskenler;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yarı çapı giriniz");
        double yaricap=scan.nextDouble();
        System.out.println("Merkez Açı ölçüsünü giriniz");
        int a = scan.nextInt();
        double  pi=3.14;
        double alan=(pi*yaricap*yaricap*a)/360;
        double cevre=2*pi*yaricap;

        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+cevre);



    }
}
