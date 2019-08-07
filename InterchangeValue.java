import java.util.Scanner;

public class InterchangeValue {
    //program to print Interchange value
    public static void main(String[] args) {
        int swap;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter Fist value A = ");
        int a = value.nextInt();
        System.out.print("Enter Second Value B = ");
        int b = value.nextInt();
        swap = a;
        a = b ;
        b = swap;

        System.out.print("Now Value Interchaged First Value A = " +a+ " and Second Value B = "+b);
    }
}
