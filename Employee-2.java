package employeepack;

public abstract class Employee implements Comparable<Employee>
{
   private String firstName;
   private String lastName;
   private String jobTitle;

   public Employee(String firstName, String lastName, String jobTitle)
   {
      this.firstName = firstName;
      this.lastName  = lastName;
      this.jobTitle  = jobTitle;
   }

   public String getFirstName() { return firstName; }
   public String getLastName()  { return lastName;  }
   public String getJobTitle()  { return jobTitle;  }

   public void setFirstName(String firstName) { this.firstName = firstName; }
   public void setLastName(String lastName)   { this.lastName  = lastName;  }
   public void setJobTitle(String jobTitle)   { this.jobTitle  = jobTitle;  }

   public abstract double weeklyPay();

   public int compareTo(Employee other)
   {
      return this.lastName.compareToIgnoreCase(other.lastName);
   }
}
