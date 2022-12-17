import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi,ussu,total;

        System.out.print("Üssünü Hesaplamak istediğiniz sayıyı giriniz.. : ");
        sayi= scanner.nextInt();
        total=1;
        System.out.print("Üssün değerini giriniz.. : ");
        ussu= scanner.nextInt();

        for (int i=1;i<=ussu;i++) {
            total=total*sayi;
        }
        System.out.print("Sonuc ="+total );
    }
}