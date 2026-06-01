package employeepack;

public class Manager extends SalariedEmployee
{
   private double weeklyBonus;

   public Manager(String firstName, String lastName,
                  String jobTitle, double annualSalary, double weeklyBonus)
   {
      super(firstName, lastName, jobTitle, annualSalary);
      this.weeklyBonus = weeklyBonus;
   }

   public double getWeeklyBonus()             { return weeklyBonus;       }
   public void   setWeeklyBonus(double bonus) { this.weeklyBonus = bonus; }

   public double weeklyPay()
   {
      return super.weeklyPay() + weeklyBonus;
   }
}