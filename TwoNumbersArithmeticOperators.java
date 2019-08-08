
import java.util.Scanner;

public class TwoNumbersArithmeticOperators {
    //enter two numbers & do arithmetic operation
    public static void main(String[] args) {
     Scanner number =new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=number.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=number.nextInt();
        System.out.print("Enter Operator :");
       char ope = number.next().charAt(0);
        if (ope =='+'){
            System.out.println("This is Addition Operator " +num1+ " + "+num2+" = "+(num1+num2));
        }
        else if (ope =='-'){
            System.out.println("This is Subtraction Operator " +num1+ " - "+num2+" = "+(num1-num2));
        }
        else if (ope =='*'){
            System.out.println("This is Multiplication Operator " +num1+ " * "+num2+" = "+(num1*num2));
        }
        else if (ope =='/'){
            System.out.println("This is Division Operator " +num1+ " / "+num2+" = "+(num1/num2));
        }
        else {
            System.out.println("Invalid");
        }




    }
}
