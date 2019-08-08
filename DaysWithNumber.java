import java.util.Scanner;

public class DaysWithNumber {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.print("Enter any number from 1 to 7 to find out day :");
        int day = num1.nextInt();

        if (day ==1){
            System.out.println("1 = Monday");
        }
        else if (day ==2){
            System.out.println( "2 = Tuesday");
        }
        else if (day ==3){
            System.out.println("3 = Wednesday");
        }
        else if (day ==4){
            System.out.println("4 = Thursday");
        }
        else if (day ==5){
            System.out.println("5 = Friday");
        }
        else if (day ==6){
            System.out.println("6 = Saturday");
        }
        else if (day ==7){
            System.out.println("7 = Sunday");
        }
        else {
            System.out.println("Invalid Number");
        }

    }
}
