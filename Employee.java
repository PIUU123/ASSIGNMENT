import java.io.*;
import java.util.Scanner;
public class Employee
{
public static void main(String args[]) {
  

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Basic pay of Employee");

       float basic_pay = sc.nextFloat();

       double DA = ((12.0/100) * basic_pay) + basic_pay;

       double HRA = ((13.0/100) * basic_pay) + basic_pay;

       double PF = ((15/100) * basic_pay) + basic_pay;

       double gross_pay = basic_pay + DA + HRA;

       

       System.out.println("The Gross Pay is: "+gross_pay);

       
   }

}