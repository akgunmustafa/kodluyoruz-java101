import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Ebob-Ekok hesaplamak istediğiniz 1. sayıyı giriniz :");
        int n1= input.nextInt();

        System.out.print("Ebob-Ekok hesaplamak istediğiniz 2. sayıyı giriniz :");
        int n2= input.nextInt();
        int ebob;

        if (n1<n2){
            for (int i=n1; i>=1;i--){
                if (n1%i==0 && n2%i==0){
                    ebob=i;
                    System.out.println("ebob : "+ebob);
                    break;
                }
            }
        }else {
            for (int i=n2; i>=1;i--){
                if (n1%i==0 && n2%i==0){
                    ebob=i;
                    System.out.print("ebob : "+ebob);
                    break;
                }
            }

        }System.out.println(" ");
        for (int i=1; i<=(n1*n2); i++){
            if (i%n1==0&&i%n2==0){
                System.out.print("ekok : " +i);
                break;
            }
        }


    }
}