package KosulluIfadeler;

import java.util.Scanner;

public class HavaDurumu {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz :");
        int sicaklik=scan.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilir siniz");
        }else if(sicaklik>=5&&sicaklik<15){
            System.out.println("Sinemaya Gidebilirsiniz ");
        }else  if(sicaklik>=15&&sicaklik<25){
            System.out.println("Piknik Yapabilirsiniz");
        }else if(sicaklik>=25){
            System.out.println("Yüzme ye gidebilirsiniz");
        }

    }
}
