import java.util.Scanner;

public class OddsEvenTurneryOperator {
    //Program to find out it is Odd or Even by input two numbers with turnery Operator
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter First Number :");
        //
        int firstnum = number.nextInt();
        System.out.print("Enter Second Number :");
        int secondnum = number.nextInt();
        int value1 = firstnum%2;
        int value2 = secondnum%2;
        String result1 = "odd";
        String result2 = "Even";
        //checking first & Second value is even or odd
        String ans1 = (value1==0)? result2:result1;
        String ans2 = (value2==0)? result2:result1;
        //Printing result
        System.out.print("First Number " +firstnum+ " is " +ans1+ " and Second Number "+secondnum+ " is " +ans2);


    }
}
