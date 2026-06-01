package employeepack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDate;

public class ManageBusiness
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      BookstoreInfo store = new BookstoreInfo(
            "Page Turner Bookstore",
            "123 Reading Lane, Bookville, NY",
            0.0);

      System.out.println("===========================================");
      System.out.println("  Welcome to " + store.getBusinessName());
      System.out.println("  " + store.getLocation());
      System.out.println("===========================================");

      double revenue = 0;
      boolean validRevenue = false;
      while (!validRevenue)
      {
         try
         {
            System.out.print("Enter this week's total sales revenue: $");
            revenue = Double.parseDouble(in.nextLine().trim());
            validRevenue = true;
         }
         catch (NumberFormatException e)
         {
            System.out.println("Invalid input. Please enter a number.");
         }
      }
      store.setWeeklySalesRevenue(revenue);

      ArrayList<Employee> staff = new ArrayList<>();

      System.out.println("\n--- Enter Employee Information ---");
      System.out.println("(Type 'done' for first name when finished)\n");

      boolean keepGoing = true;
      while (keepGoing)
      {
         System.out.print("First name (or 'done'): ");
         String firstName = in.nextLine().trim();

         if (firstName.equalsIgnoreCase("done"))
         {
            keepGoing = false;
         }
         else
         {
            System.out.print("Last name: ");
            String lastName = in.nextLine().trim();

            System.out.print("Job title: ");
            String jobTitle = in.nextLine().trim();

            System.out.print("Employee type (H = Hourly, S = Salaried, B = Buyer): ");
            String typeCode = in.nextLine().trim().toUpperCase();

            Employee emp = null;

            if (typeCode.equals("H"))
            {
               double wage = 0;
               boolean validWage = false;
               while (!validWage)
               {
                  try
                  {
                     System.out.print("  Hourly wage: $");
                     wage = Double.parseDouble(in.nextLine().trim());
                     validWage = true;
                  }
                  catch (NumberFormatException e)
                  {
                     System.out.println("  Invalid input. Please enter a number.");
                  }
               }

               int hours = 0;
               boolean validHours = false;
               while (!validHours)
               {
                  try
                  {
                     System.out.print("  Hours worked this week: ");
                     hours = Integer.parseInt(in.nextLine().trim());
                     validHours = true;
                  }
                  catch (NumberFormatException e)
                  {
                     System.out.println("  Invalid input. Please enter a whole number.");
                  }
               }

               emp = new HourlyEmployee(firstName, lastName, jobTitle, wage, hours);
            }
            else if (typeCode.equals("S"))
            {
               double salary = 0;
               boolean validSalary = false;
               while (!validSalary)
               {
                  try
                  {
                     System.out.print("  Annual salary: $");
                     salary = Double.parseDouble(in.nextLine().trim());
                     validSalary = true;
                  }
                  catch (NumberFormatException e)
                  {
                     System.out.println("  Invalid input. Please enter a number.");
                  }
               }

               emp = new SalariedEmployee(firstName, lastName, jobTitle, salary);
            }
            else if (typeCode.equals("B"))
            {
               double salary = 0;
               boolean validSalary = false;
               while (!validSalary)
               {
                  try
                  {
                     System.out.print("  Annual salary: $");
                     salary = Double.parseDouble(in.nextLine().trim());
                     validSalary = true;
                  }
                  catch (NumberFormatException e)
                  {
                     System.out.println("  Invalid input. Please enter a number.");
                  }
               }

               double bonus = 0;
               boolean validBonus = false;
               while (!validBonus)
               {
                  try
                  {
                     System.out.print("  Weekly bonus: $");
                     bonus = Double.parseDouble(in.nextLine().trim());
                     validBonus = true;
                  }
                  catch (NumberFormatException e)
                  {
                     System.out.println("  Invalid input. Please enter a number.");
                  }
               }

               emp = new Manager(firstName, lastName, jobTitle, salary, bonus);
            }
            else
            {
               System.out.println("  Invalid type code. Skipping this employee.");
               continue;
            }

            System.out.printf("  Weekly pay for %s %s: $%.2f%n%n",
                              firstName, lastName, emp.weeklyPay());
            staff.add(emp);
         }
      }

      Collections.sort(staff);

      try
      {
         PrintWriter writer = new PrintWriter("employee_report.txt");
         LocalDate today = LocalDate.now();

         writer.println("===========================================");
         writer.println("  " + store.getBusinessName());
         writer.println("  " + store.getLocation());
         writer.println("  Report Date: " + today);
         writer.println("===========================================");
         writer.printf("  Weekly Sales Revenue: $%.2f%n", store.getWeeklySalesRevenue());
         writer.println("===========================================");
         writer.println();

         writer.printf("%-15s %-15s %-20s %12s%n", "First Name", "Last Name", "Job Title", "Weekly Pay");
         writer.println("-----------------------------------------------------------");

         for (Employee e : staff)
         {
            writer.printf("%-15s %-15s %-20s %12.2f%n",
                          e.getFirstName(), e.getLastName(),
                          e.getJobTitle(), e.weeklyPay());
         }

         writer.println("-----------------------------------------------------------");

         double totalPayroll = 0;
         for (Employee e : staff)
            totalPayroll += e.weeklyPay();

         writer.printf("%-51s %12.2f%n", "TOTAL WEEKLY PAYROLL", totalPayroll);
         writer.println();
         writer.println("Total employees: " + staff.size());

         writer.close();
         System.out.println("Report saved to employee_report.txt");
      }
      catch (IOException e)
      {
         System.out.println("Error writing report file: " + e.getMessage());
      }

      System.out.println("\n--- Weekly Employee Report (sorted by last name) ---");
      System.out.printf("%-15s %-15s %-20s %12s%n", "First Name", "Last Name", "Job Title", "Weekly Pay");
      System.out.println("-----------------------------------------------------------");

      double totalPayroll = 0;
      for (Employee e : staff)
      {
         System.out.printf("%-15s %-15s %-20s %12.2f%n",
                           e.getFirstName(), e.getLastName(),
                           e.getJobTitle(), e.weeklyPay());
         totalPayroll += e.weeklyPay();
      }

      System.out.println("-----------------------------------------------------------");
      System.out.printf("%-51s %12.2f%n", "TOTAL WEEKLY PAYROLL", totalPayroll);

      in.close();
   }
}