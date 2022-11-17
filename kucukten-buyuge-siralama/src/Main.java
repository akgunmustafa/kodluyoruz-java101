import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input= new Scanner(System.in);

        System.out.print("1. Sayı : ");
        a= Double.parseDouble(input.nextLine());
        System.out.print("2. Sayı : ");
        b= Double.parseDouble(input.nextLine());
        System.out.print("3. Sayı : ");
        c= Double.parseDouble(input.nextLine());
        System.out.println("Hello world!");
        if (a>b && a>c){
            if (b>c){
                System.out.println("1.Sayı > 2. Sayı > 3. Sayı");
            } else {
                System.out.println("1.Sayı > 3. Sayı > 2. Sayı");
            }

        }
        if (b>a && b>c){
            if (a>c){
                System.out.println("2.Sayı > 1. Sayı > 3. Sayı");
            } else {
                System.out.println("2.Sayı > 3. Sayı > 1. Sayı");
            }

        }else{
            if (b>a){
            System.out.println("3.Sayı > 2. Sayı > 1. Sayı");
            }else {
                System.out.println("3.Sayı > 1. Sayı > 2. Sayı");
            }
        }

    }
}