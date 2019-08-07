import java.util.Scanner;

public class LeapYear {
    // program to find out Leap year
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int number = year.nextInt();
        int value = number%4;
        String yes = "Leap Year";
        String no = "Not Leap Year";
        String ans = (value==0)?yes:no;
        System.out.print("Entered Year "+number+" is " +ans);

    }
}
