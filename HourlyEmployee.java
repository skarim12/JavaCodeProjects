package employeepack;

public class HourlyEmployee extends Employee
{
   private double hourlyWage;
   private int    hoursWorked;

   public HourlyEmployee(String firstName, String lastName,
                         String jobTitle, double hourlyWage, int hoursWorked)
   {
      super(firstName, lastName, jobTitle);
      this.hourlyWage  = hourlyWage;
      this.hoursWorked = hoursWorked;
   }

   public double getHourlyWage()  { return hourlyWage;  }
   public int    getHoursWorked() { return hoursWorked; }

   public void setHourlyWage(double hourlyWage)  { this.hourlyWage  = hourlyWage;  }
   public void setHoursWorked(int hoursWorked)   { this.hoursWorked = hoursWorked; }

   public double weeklyPay()
   {
      double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         pay += (hoursWorked - 40) * 0.5 * hourlyWage;
      }
      return pay;
   }
}