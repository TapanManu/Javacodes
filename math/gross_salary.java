import java.util.Scanner;

class EmployeeSalary
{
 public static void main(String args[]) 
 {
  float basic_salary,da,hra,da1,hra1,GrossPayment;

  Scanner scan=new Scanner(System.in);

  System.out.println("Enter Basic Salary Of Employee: ");
  basic_salary=scan.nextFloat();

  System.out.println("Enter Basic DA Of Employee: "); 
  da1=scan.nextFloat();
 
  System.out.println("Enter Basic HRA Of Employee: ");
  hra1=scan.nextFloat();

  da = (da1 * basic_salary) / 100;
  hra = (hra1 * basic_salary) / 100;

  GrossPayment = basic_salary + da + hra;

  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}
