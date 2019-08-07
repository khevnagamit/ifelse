import java.util.Scanner;

public class VoteEligibility {
    // Person is eligible for vote or not
    public static void main(String[] args) {
        Scanner vote = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name =vote.next();
        System.out.print("Enter Age :");
        int age = vote.nextInt();
        if (age >=18) {
            System.out.println(name+" is Eligible for Vote");
        }
        else{
            System.out.println(name+" is not Eligible for VOte");
        }

    }
}
