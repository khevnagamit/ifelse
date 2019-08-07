import java.util.Scanner;

public class SalsCommission {
    //program to find out Commission
    public static void main(String[] args) {
        Scanner sale = new Scanner(System.in);
        System.out.print("Enter Seller's ID :");
        int id = sale.nextInt();
        System.out.print("Enter Seller's Name :");
        String name = sale.next();
        System.out.print("Enter Sales's Amount :");
        int amount = sale.nextInt();
        System.out.print("Enter Salary Basic :");
        int basic = sale.nextInt();
        if (amount>=50000){
            System.out.println(name +" Commission Amount = "+amount*0.35);
        }
        else if (amount>=30000){
            System.out.println(name +"Commission Amount = "+amount*0.20);
        }
        else if (amount>=20000){
            System.out.println(name +"Commission Amount = "+amount*0.10);
        }
        else if (amount>=10000){
            System.out.println(name +"Commission Amount = "+amount*0.05);
        }
        else{
            System.out.println(name +"Commission Amount = "+amount*0.02);
        }
    }
}
