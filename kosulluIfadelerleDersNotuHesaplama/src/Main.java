
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        matematik=input.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik=input.nextInt();
        System.out.print("Turkce Notunuz :");
        turkce=input.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya=input.nextInt();
        System.out.print("Muzik Notunuz :");
        muzik=input.nextInt();
        double avarage= (matematik+fizik+turkce+kimya+muzik)/5;
        if (matematik<0 || matematik>100
                || fizik<0 || fizik>100 || turkce<0 || turkce>100 || kimya<0 || kimya>100 || muzik<0 || muzik>100){
            System.out.println("Lütfen 0 ve 100 aralığında bir değer giriniz. Program sonlanıyor, işlem yapılamadı");
        }
        else {
            if (avarage>55){
                System.out.println("Tebrikler Geçme Notunuz : "+avarage);
            }
            else {
                System.out.println("Üzgünüz Kalma Notunuz : "+avarage);
            }
        }
    }
}