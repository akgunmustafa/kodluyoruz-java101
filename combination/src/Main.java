import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y, z,p=1,r=1,s=1,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combinasyon hesaplaması için 2 değer giriniz. C(x,y)");

        System.out.print("İlk değer x : ");
        x = scanner.nextInt();

        System.out.print("İkinci değer y :");
        y = scanner.nextInt();

        z = x - y;

        for (int i = 1; i <= x; i++) { //Girilen ilk sayının faktöriyeli için döngü.
            p=p*i;
        }System.out.println("x! ="+p);

        for (int e = 1; e <= y; e++) { //Girilen ikinci sayının faktöriyeli için döngü.
            r =r* e;
        }System.out.println("y! ="+r);

        for (int a = 1; a <= z; a++) { //Girilen sayıların farkının faktöriyeli için döngü.
            s =s* a;
        }
        result = p/(r*s); //Kombinasyon Formülü
        System.out.print("C(x,y) = " + result);
    }
}