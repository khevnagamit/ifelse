import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class CityName {
    // Type alphabet a to f & give City name accordingly other invalid
    public static void main(String[] args) {
       // Scanner alpha = new Scanner(System.in);
       // System.out.print("Enter Single Alphabet :");
        char city ='o';

        String a = "Ahmadabad";
        String b = "Baroda";
        String c = "Chennai";
        String d ="Daman";
        String e ="Euston";
        String f ="Faridabad";

        if (city == 'a'){
            System.out.println("a for "+a);
        }
        else if(city =='b'){
            System.out.println("b for "+b);
        }
        else if(city =='c'){
            System.out.println("c for "+c);
        }
        else if(city =='d'){
            System.out.println("d for "+d);
        }
        else if(city =='e'){
            System.out.println("e for "+e);
        }
        else if(city =='f'){
            System.out.println("f for "+f);
        }

        else {
            System.out.println("Character is Invalid ");
        }
    }
}
