import java.util.Scanner;

public class PositiveNegativeZero {
    //program to find out number is Positive Negative or Zero
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = num.nextInt();
        if(a >0){
            System.out.println("Entered Number is Positive ");
        }
        else if(a<0){
            System.out.println("Entered Number is Negative");
        }
        else {
            System.out.println("Entered Number is Zero");
        }


    }
}
