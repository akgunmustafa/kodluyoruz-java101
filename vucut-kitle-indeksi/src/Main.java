import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float boy;
        double kg;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz  : ");
        boy = input.nextFloat();
        System.out.print("Lütfen kilonuzu Giriniz : ");
        kg = input.nextDouble();
        double indeks = kg / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}