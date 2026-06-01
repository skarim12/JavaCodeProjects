package sjuJavaprojects;
import java.util.ArrayList;

public class Stats {

   private ArrayList<Double> prices;

   public Stats(ArrayList<Double> prices) {
      this.prices = prices;
   }

   public double average() {
      double sum = 0;
      for (int i = 0; i < prices.size(); i++) {
         sum = sum + prices.get(i);
      }
      return sum / prices.size();
   }

   public double min() {
      double min = prices.get(0);
      for (int i = 1; i < prices.size(); i++) {
         if (prices.get(i) < min) {
            min = prices.get(i);
         }
      }
      return min;
   }

   public double max() {
      double max = prices.get(0);
      for (int i = 1; i < prices.size(); i++) {
         if (prices.get(i) > max) {
            max = prices.get(i);
         }
      }
      return max;
   }

   public double standardDeviation() {
      double mean = average();
      double sum = 0;
      for (int i = 0; i < prices.size(); i++) {
         sum = sum + Math.pow(prices.get(i) - mean, 2);
      }
      return Math.sqrt(sum / prices.size());
   }
}
