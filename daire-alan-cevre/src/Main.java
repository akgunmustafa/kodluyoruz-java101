import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        Scanner input=new Scanner(System.in);
        System.out.print("Yari çapınızı giriniz : ");
        r=input.nextInt();

        double pi=3.14;
        double alan=pi*r*r;
        double cevre=pi*r*2;
        System.out.print("Alan = "+alan);
        System.out.print("Çevre = "+cevre);
        System.out.print("Merkez açı ölçüsünü verirsen, istediğin dairenin dliminini alanını bulurum..");
        double aci;
        aci=input.nextDouble();
        double sonuc=pi*r*r*aci;
        System.out.print("Dilimin alanı = "+sonuc/360);


    }
}