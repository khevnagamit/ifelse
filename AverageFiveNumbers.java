import java.util.Scanner;

public class AverageFiveNumbers {
    //program to find out average of Five numbers
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int one = number.nextInt();
        System.out.print("Enter Second Number :");
        int two = number.nextInt();
        System.out.print("Enter Third Number :");
        int three = number.nextInt();
        System.out.print("Enter Fourth Number :");
        int four = number.nextInt();
        System.out.print("Enter Fifth Number :");
        int five = number.nextInt();
        int tot = one+two+three+four+five;
        System.out.println("Total ="+tot);
        double avg = tot /5;
        System.out.println("Above number's Average is = " +avg);

    }
}
