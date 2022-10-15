import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 3 kenarı bilinen üçgenin alanını bulma.
        double kenar1,kenar2,kenar3;
        double alan,x;
        Scanner inp=new Scanner(System.in);

        System.out.print("1.Kenar:");
        kenar1= inp.nextDouble();

        System.out.print("2.Kenar:");
        kenar2= inp.nextDouble();

        System.out.print("3.Kenar:");
        kenar3= inp.nextDouble();

        x=((kenar1+kenar2+kenar3)/2);
        alan=Math.sqrt(x*(x-kenar1)*(x-kenar2)*(x-kenar3));
        System.out.println("Alan:"+alan);

        System.out.print("Hipotenüsün hesaplanması için... ;  ");
        // Dik kenarları bilinen üçgenin hipotenüsünü bulma.
        double a, b;
        double c, cevre;
        System.out.print("1.Dik kenarını giriniz: ");
        a = inp.nextDouble();

        System.out.print("2.Dik kenarını giriniz: ");
        b = inp.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs uzunluğu : " + c);
    }
}