package KosulluIfadeler;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");

        String userName=scanner.nextLine();

        System.out.print("Şifreniz: ");
        String password=scanner.nextLine();
        if(userName.equals("Patika")&&password.equals("123456")){
            System.out.println("Başarılı Giriş Yapılıyor ...");

        }else {
         System.out.print("Şifrelenizi Sıfırlamak için yeni şifrenizi yazınınz: ");
          String alinan=scanner.nextLine();
          if(alinan!=password){
              System.out.println("Şifre Oluşturuldu");
          }else {
              System.out.println("Şifre Oluşturulamadı(!Şifreler aynı olamaz)");
          }





        }




    }
}
