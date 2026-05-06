package employeepack;

public class BookstoreInfo
{
   private String businessName;
   private String location;
   private double weeklySalesRevenue;

   public BookstoreInfo(String businessName, String location, double weeklySalesRevenue)
   {
      this.businessName       = businessName;
      this.location           = location;
      this.weeklySalesRevenue = weeklySalesRevenue;
   }

   public String getBusinessName()       { return businessName;       }
   public String getLocation()           { return location;           }
   public double getWeeklySalesRevenue() { return weeklySalesRevenue; }

   public void setBusinessName(String name)          { this.businessName       = name;    }
   public void setLocation(String location)          { this.location           = location;}
   public void setWeeklySalesRevenue(double revenue) { this.weeklySalesRevenue = revenue; }
}