
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double base = input.nextInt();

        System.out.print("Enter exponent number: ");
        int exponent = input.nextInt();
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        }
        System.out.println(result);
    }

}
