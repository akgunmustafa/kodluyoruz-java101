import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double heat;

        Scanner input= new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz : ");
        heat= Double.parseDouble(input.nextLine());

        if (heat<5){
            System.out.println("Kayak Yapmanızı Öneriyoruz Çünkü Hava : "+heat+" Derece");
        } else if (heat<=15) {
            System.out.println("Sinemaya Gitmenizi Öneriyoruz Çünkü Hava : "+heat+" Derece");

        } else if (heat<=25) {
            System.out.println("Pikniğe Gitmenizi Öneriyoruz Çünkü Hava : "+heat+" Derece");
        }else {
            System.out.println("Yüzmeye Gitmenizi Öneriyoruz Çünkü Hava : "+heat+" Derece");
        }


        System.out.println("Hello world!");
    }
}