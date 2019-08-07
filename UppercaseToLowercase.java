import java.util.Scanner;

public class UppercaseToLowercase {
    //program to conver alphabet from Uppercase to Lowercase
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String old="";
        System.out.print("Enter any Uppercase Character :");
        old = input.nextLine();
        String lowercase ="";
        lowercase = old.toLowerCase();

        System.out.println("Converted character ="+lowercase);

    }
}
