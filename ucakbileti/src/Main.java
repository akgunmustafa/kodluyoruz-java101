import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        double base,km,year,destination,totalfirst,destinationlast;
        base=0.10;
        Scanner input=new Scanner(System.in);
        System.out.println("Name and Surname : ");
        name=input.nextLine();
        System.out.print("How Old Are You? :");
        year=input.nextDouble();
        System.out.print("How Many Kilometers? :");
        km=input.nextDouble();
        System.out.print("if One Way Press(1) or if Round Trip Press(2) :");
        destination=input.nextDouble();
        totalfirst=base*km*destination;

        if (destination==1){
            destinationlast=1;
        }else {
            destinationlast=2;
        }
        if (year<0||km<0){
            System.out.println("Kilometers and years don't be negative numbers.");
        }else {
            if (year<12){
                totalfirst=totalfirst/2;
                if (destinationlast==1){
                    System.out.print("Total Fee is = "+totalfirst+" $ ...Have a nice flight dear "+name+" .");
                }else{
                    totalfirst=totalfirst-20*totalfirst/100;
                    System.out.print("Total Fee is = "+totalfirst+" $ ...Have a nice flight dear "+name+" .");
                }

            } else if (year>12 && year<25) {
                totalfirst=totalfirst-10*totalfirst/100;
                if (destinationlast==1){
                    System.out.print("Total Fee is = "+totalfirst+" $ ...Have a nice flight dear "+name+" .");
                }else{
                    totalfirst=totalfirst-20*totalfirst/100;
                    System.out.print("Total Fee is = "+totalfirst+" $ ...Have a nice flight dear "+name+" .");
                }
            } else if (year>65) {
                totalfirst=totalfirst-60*totalfirst/100;
                if (destinationlast==1){
                    System.out.print("Total Fee is = "+totalfirst+" $ ...Have a nice flight dear "+name+" .");
                }else{
                    totalfirst=totalfirst-20*totalfirst/100;
                    System.out.print("Total Fee is = "+totalfirst+" $ ...Have a nice flight dear "+name+" .");
                }
            }
        }
    }
}