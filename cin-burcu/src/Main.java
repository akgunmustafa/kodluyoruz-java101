import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        double zodiacnumber;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year=input.nextInt();
        zodiacnumber=year%12;
        String chineszodiac;
        if (zodiacnumber==0){
            chineszodiac="Çin Zodyağı Burcunuz : Maymun";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==1){
            chineszodiac="Çin Zodyağı Burcunuz : Horoz";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==2){
            chineszodiac="Çin Zodyağı Burcunuz : Köpek";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==3){
            chineszodiac="Çin Zodyağı Burcunuz : Domuz";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==4){
            chineszodiac="Çin Zodyağı Burcunuz : Fare";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==5){
            chineszodiac="Çin Zodyağı Burcunuz : Öküz";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==6){
            chineszodiac="Çin Zodyağı Burcunuz : Kaplan";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==7){
            chineszodiac="Çin Zodyağı Burcunuz : Tavşan";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==8){
            chineszodiac="Çin Zodyağı Burcunuz : Ejderha";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==9){
            chineszodiac="Çin Zodyağı Burcunuz : Yılan";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==10){
            chineszodiac="Çin Zodyağı Burcunuz : At";
            System.out.println(chineszodiac);
        }
        if (zodiacnumber==11){
            chineszodiac="Çin Zodyağı Burcunuz : Koyun";
            System.out.println(chineszodiac);
        }

    }
}