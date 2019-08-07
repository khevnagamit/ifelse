import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Enter Employee ID :");
        int eid= salary.nextInt();
        System.out.print("Enter Employee Name :");
        String ename = salary.next();
        System.out.print("Enter Basic Salary :");
        int esalary = salary.nextInt();
        double hra = esalary*0.10;
        double da = esalary*0.08;
        double ta = esalary*0.09;
        double pf = esalary*0.20;
        double gross = esalary+hra+da+ta+pf;
        System.out.println("HRA = " +hra );
        System.out.println("DA = "+da);
        System.out.println("TA = "+ta);
        System.out.println("PF = "+pf);
        System.out.println(ename+"' Gross Salary ="+gross);
    }
}
