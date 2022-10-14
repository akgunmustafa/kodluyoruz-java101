import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Data Input
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat=inp.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik=inp.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya=inp.nextInt();
        System.out.print("Turkce Notunuz : ");
        turkce=inp.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih=inp.nextInt();
        System.out.print("Muzik Notunuz : ");
        muzik=inp.nextInt();

        //CALCULATE
        int toplam=(mat+fizik+muzik+tarih+turkce+kimya);
        System.out.println("Sistem durumunuzu değerlendiriyor....");
        System.out.println("-----------------------------------------");
        int sonuc=toplam/6;
        boolean low = sonuc <= 60;
        System.out.println("Ortalamanız : "+sonuc);
        System.out.println("-----------------------------------------");
        System.out.println(low ? "Hadi iyisin Kaldın" : "Helal geçtin");


    }
}