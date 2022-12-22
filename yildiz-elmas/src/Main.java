import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz : ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            for (int a = 1; a <= (2 * i) - 1; a++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int b = n; b >= 1; b--) {

            for (int d = 1; d <= (n - b); d++) {
                System.out.print(" ");

            }
            for (int a = 1; a <= (2 * b) - 1; a++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}