package employeepack;

public class SalariedEmployee extends Employee
{
   private double annualSalary;

   public SalariedEmployee(String firstName, String lastName,
                           String jobTitle, double annualSalary)
   {
      super(firstName, lastName, jobTitle);
      this.annualSalary = annualSalary;
   }

   public double getAnnualSalary()              { return annualSalary;        }
   public void   setAnnualSalary(double salary) { this.annualSalary = salary; }

   public double weeklyPay()
   {
      return annualSalary / 52;
   }
}