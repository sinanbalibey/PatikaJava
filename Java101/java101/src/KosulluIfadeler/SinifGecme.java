package KosulluIfadeler;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

            System.out.print("Matematik Notunuz: ");
            int mat=scan.nextInt();

            System.out.print("Fizik Notunuz: ");
            int fiz=scan.nextInt();

            System.out.print("Türkçe Notunuz: ");
            int tur=scan.nextInt();

            System.out.print("Kimya Notunuz: ");
            int kim=scan.nextInt();

            System.out.print("Muzik Notunuz: ");
            int muz=scan.nextInt();


            double ortalama=(mat+fiz+tur+kim+muz)/5;

            if(ortalama>100||ortalama<0){
                System.out.println("Hatalı Not Girdiniz");
            }else if(ortalama>=55){
                System.out.println("Geçtiniz Ortalamanız: "+ortalama);
            }
            else {
                System.out.println("Kaldınız Ortalamanız: "+ortalama);
            }



    }
}
