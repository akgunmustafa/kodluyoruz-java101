import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, z, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combinasyon hesaplaması için 2 değer giriniz. C(x,y)");

        System.out.print("İlk değer x : ");
        x = scanner.nextInt();

        System.out.print("İkinci değer y :");
        y = scanner.nextInt();
        z = x - y;
        // C(x,y) = x! / (y! * (x-y)!)
        for (int o = 1; o <= z; o++) {
            z *= o;
        }
        for (int i = 1; i <= x; i++) {
            x *= i;
        }
        for (int e = 1; e <= y; e++) {
            z *= e;
        }
        result = x / (y * z);
        System.out.print("C(x,y) = " + result);
    }
}