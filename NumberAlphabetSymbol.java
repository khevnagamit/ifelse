import java.util.Scanner;

public class NumberAlphabetSymbol {
    // program to find out Number Alphabet or Symbol
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        char input = '@';
        if((input<='a' && input>='z')|| (input<='A' && input >='Z')){
            System.out.println(input +" is Alphabet.");
        }
        else if ((input<=9 && input>=0)|| (input<=9 && input >=0)){
            System.out.println(input +" is Number.");
        }
        else {
            System.out.println(input +" is Symbol");
        }



    }
}
