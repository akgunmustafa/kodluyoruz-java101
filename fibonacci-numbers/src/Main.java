import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, i, sayi1;
        int sayi2 = 0, sayi3 = 1;

        System.out.print("Dizinin Eleman Sayısı : ");
        sayi = scanner.nextInt();

        System.out.print("Fibonacci Dizisi : " + sayi2 + " , " + sayi3);

        for (i = 1; i <= sayi - 2; i++) {
            sayi1 = sayi2 + sayi3;
            System.out.print(" , " + sayi1);
            sayi2 = sayi3;
            sayi3 = sayi1;
        }
    }
}