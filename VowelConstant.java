import java.util.Scanner;

public class VowelConstant {
    //program to find out Vowel or Constant
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
       // System.out.println("Enter Character : ");
        String data = "a";
        if(data == "a"){
            System.out.println("Character " + data+ " is vowel." );
        }
        else if(data == "e"){
            System.out.println("Character " + data+ " is vowel." );
        }
        else if(data== "i"){
            System.out.println("Character " + data+ " is vowel." );
        }
        else if(data== "o"){
            System.out.println("Character " + data+ " is vowel." );
        }
        else if(data== "u"){
            System.out.println("Character " + data+ " is vowel." );
        }
        else {
            System.out.println("Character " + data+ " is Constant.");
        }
    }
}
