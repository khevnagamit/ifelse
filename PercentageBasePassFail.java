import java.util.Scanner;

public class PercentageBasePassFail {
    // Student is Pass or Fail on basis of Percentage
    public static void main(String[] args) {
        Scanner detail = new Scanner(System.in);
        System.out.print("Enter Student's Name : ");
        String name = detail.next();
        System.out.print("Enter Student's Roll Number : ");
        int rollnum = detail.nextInt();
        System.out.print("Enter English Marks Out of 100: ");
        int english = detail.nextInt();
        System.out.print("Enter Maths Marks Out of 100: ");
        int maths = detail.nextInt();
        System.out.print("Enter Science Marks Out of 100: ");
        int science = detail.nextInt();
        int total = english+maths+science;
        int percentage = (total/3);
        if (percentage>=80){
            System.out.println("Name "+name + " and Roll Number "+rollnum + " had Total Marks ="+total+" Total Percentage ="+percentage+" is Pass & have Grad A+." );
        }
        else if (percentage>=60){
            System.out.println("Name "+name + " and Roll Number "+rollnum + " had Total Marks ="+total+" Total Percentage ="+percentage+" is Pass & have Grad A. " );
        }
        else if (percentage>=50){
            System.out.println("Name "+name + " and Roll Number "+rollnum + " had Total Marks ="+total+" Total Percentage ="+percentage+" is Pass & have Grad B.");
        }
        else if(percentage>=35){
            System.out.println("Name "+name + " and Roll Number "+rollnum + " had Total Marks ="+total+" Total Percentage ="+percentage+" is Pass & have Grad C. " );
        }
        else {
            System.out.println("Name "+name + " and Roll Number "+rollnum + " had Total Marks ="+total+" Total Percentage ="+percentage+" is Fail");
        }

    }
}
