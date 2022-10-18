import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut;
        double elma;
        double domates;
        double muz;
        double patlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armut=input.nextDouble()*2.14;

        System.out.print("Elma  kaç kilo ? : ");
        elma=input.nextDouble()*3.67;

        System.out.print("Domates kaç kilo ? : ");
        domates=input.nextDouble()*1.11;

        System.out.print("Muz kaç kilo ? : ");
        muz=input.nextDouble()*0.95;

        System.out.print("Patlican kaç kilo ? : ");
        patlican=input.nextDouble()*5;

        double toplam=armut+elma+domates+muz+patlican;




        System.out.println("Toplam Tutar = "+toplam);
    }
}