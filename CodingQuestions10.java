package sjuJavaprojects;
import java.util.ArrayList;
public class Assignment3Q {
	

	    // Q6 helper method
	    public static ArrayList<Integer> filterEvens(ArrayList<Integer> nums) {
	        ArrayList<Integer> evens = new ArrayList<Integer>();
	        for (int i = 0; i < nums.size(); i++) {
	            if (nums.get(i) % 2 == 0) {
	                evens.add(nums.get(i));
	            }
	        }
	        return evens;
	    }

	    public static void main(String[] args) {

	        // Q1: Initialize and Print Array
	        System.out.println("Q1: Multiples of 2");
	        int[] arr = new int[5];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = (i + 1) * 2;
	        }
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }

	        // Q2: Find Sum of Array
	        System.out.println("\nQ2: Sum of Array");
	        int[] nums2 = {3, 5, 7, 9, 11};
	        int sum2 = 0;
	        for (int i = 0; i < nums2.length; i++) {
	            sum2 += nums2[i];
	        }
	        System.out.println("Sum = " + sum2);

	        // Q3: Find Max Value
	        System.out.println("\nQ3: Max Value");
	        int[] nums3 = {12, 45, 7, 34, 89, 23};
	        int max = nums3[0];
	        for (int i = 1; i < nums3.length; i++) {
	            if (nums3[i] > max) {
	                max = nums3[i];
	            }
	        }
	        System.out.println("Max = " + max);

	        // Q4: Count Even Numbers
	        System.out.println("\nQ4: Count Even Numbers");
	        int[] nums4 = {4, 7, 10, 13, 18, 21};
	        int count4 = 0;
	        for (int i = 0; i < nums4.length; i++) {
	            if (nums4[i] % 2 == 0) {
	                count4++;
	            }
	        }
	        System.out.println("Even count = " + count4);

	        // Q5: 2D Array Row Sums
	        System.out.println("\nQ5: 2D Array Row Sums");
	        int[][] grid = {{1, 2, 3},
	                        {4, 5, 6},
	                        {7, 8, 9}};
	        for (int row = 0; row < grid.length; row++) {
	            int sum5 = 0;
	            for (int col = 0; col < grid[row].length; col++) {
	                sum5 += grid[row][col];
	            }
	            System.out.println("Row " + row + " sum: " + sum5);
	        }

	        // Q6: Filter Even Numbers (ArrayList)
	        System.out.println("\nQ6: Filter Even Numbers");
	        ArrayList<Integer> numbers6 = new ArrayList<Integer>();
	        for (int i = 1; i <= 10; i++) numbers6.add(i);
	        System.out.println(filterEvens(numbers6));

	        // Q7: Remove Even Numbers
	        System.out.println("\nQ7: Remove Even Numbers");
	        ArrayList<Integer> list7 = new ArrayList<Integer>();
	        list7.add(2);
	        list7.add(7);
	        list7.add(10);
	        list7.add(13);
	        for (int i = 0; i < list7.size(); i++) {
	            if (list7.get(i) % 2 == 0) {
	                list7.remove(i);
	                i--;
	            }
	        }
	        System.out.println(list7);

	        // Q8: Search for a Value
	        System.out.println("\nQ8: Search for Value");
	        ArrayList<Integer> list8 = new ArrayList<Integer>();
	        list8.add(5);
	        list8.add(8);
	        list8.add(12);
	        int target = 8;
	        boolean found = false;
	        for (int i = 0; i < list8.size(); i++) {
	            if (list8.get(i) == target) {
	                found = true;
	            }
	        }
	        System.out.println("Found: " + found);

	        // Q9: Merge Array into ArrayList
	        System.out.println("\nQ9: Merge Array into ArrayList");
	        int[] arr9 = {1, 2, 3, 4};
	        ArrayList<Integer> list9 = new ArrayList<Integer>();
	        for (int i = 0; i < arr9.length; i++) {
	            list9.add(arr9[i]);
	        }
	        System.out.println(list9);

	        // Q10: Count Numbers Greater Than Average
	        System.out.println("\nQ10: Count Above Average");
	        int[] nums10 = {10, 20, 30, 40, 50};
	        int sum10 = 0;
	        for (int i = 0; i < nums10.length; i++) {
	            sum10 += nums10[i];
	        }
	        double avg = (double) sum10 / nums10.length;
	        int count10 = 0;
	        for (int i = 0; i < nums10.length; i++) {
	            if (nums10[i] > avg) {
	                count10++;
	            }
	        }
	        System.out.println(count10);
	    {
	}
}
}