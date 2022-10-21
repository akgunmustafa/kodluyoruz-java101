import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[]args) {
        int number1,number2,select;
        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz:");
        number1= input.nextInt();
        System.out.print("2. Sayıyı Giriniz:");
        number2= input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select=input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplama:"+(number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma:"+(number1-number2));
                break;
            case 3:
                System.out.println("Çarpma:"+(number1*number2));
                break;
            case 4:
                if(number2!=0) {
                    System.out.println("Bölme:" + (number1 / number2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Yanlış seçim.Tekrar deneyeniz.");
        }
    }
}