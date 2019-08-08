import java.util.Scanner;

public class NumberAlphabetSymbol {
    // program to find out Number Alphabet or Symbol
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter any Value :");
        char input =value.next().charAt(0);
        if((input>='a' && input<='z')|| (input>='A' && input <='Z')){
            System.out.println(input +" is Alphabet.");
        }
        else if (input>='0' && input<='9'){
            System.out.println(input +" is Number.");
        }
        else {
            System.out.println(input +" is Symbol");
        }



    }
}
