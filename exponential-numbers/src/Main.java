import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi;
        System.out.print("Bir Sayı Giriniz...: ");
        sayi= scan.nextInt();
        System.out.println("Girdiğiniz sayıya kadar 4 'ün kuvvetleri :");
        for (int i =1; i<=sayi; i*=4){
            System.out.println(i+"  ");
            }
        System.out.println("Girdiğiniz sayıya kadar 5 'ün kuvvetleri :");

        for (int i=1; i<=sayi; i*=5){
            System.out.println(+i);
            }

    }
}