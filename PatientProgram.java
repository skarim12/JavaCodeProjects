package sjuJavaprojects;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PatientProgram {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<PatientMethods> patients = new ArrayList<PatientMethods>();

      try {
         Scanner file = new Scanner(new File("patients.txt"));
         while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            double temp = Double.parseDouble(parts[2]);
            int heartRate = Integer.parseInt(parts[3]);
            patients.add(new PatientMethods(name, age, temp, heartRate));
         }
         file.close();
      } catch (FileNotFoundException e) {
         System.out.println("No patient file found. Starting with empty list.");
      }

      int choice = 0;
      while (choice != 5) {
         System.out.println("\n1. Add a patient");
         System.out.println("2. Display all patients");
         System.out.println("3. Update a patient");
         System.out.println("4. Remove a patient");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = keyboard.nextInt();
         keyboard.nextLine();

         if (choice == 1) {
            System.out.print("Enter name: ");
            String name = keyboard.nextLine();
            System.out.print("Enter age: ");
            int age = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter temperature: ");
            double temp = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.print("Enter heart rate: ");
            int heartRate = keyboard.nextInt();
            keyboard.nextLine();
            patients.add(new PatientMethods(name, age, temp, heartRate));
            System.out.println("Patient added.");

         } else if (choice == 2) {
            if (patients.size() == 0) {
               System.out.println("No patients on record.");
            } else {
               for (int i = 0; i < patients.size(); i++) {
                  System.out.println((i + 1) + ". " + patients.get(i));
               }
            }

         } else if (choice == 3) {
            for (int i = 0; i < patients.size(); i++) {
               System.out.println((i + 1) + ". " + patients.get(i));
            }
            System.out.print("Enter patient number to update: ");
            int index = keyboard.nextInt() - 1;
            keyboard.nextLine();
            System.out.print("Enter new name: ");
            String name = keyboard.nextLine();
            System.out.print("Enter new age: ");
            int age = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter new temperature: ");
            double temp = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.print("Enter new heart rate: ");
            int heartRate = keyboard.nextInt();
            keyboard.nextLine();
            patients.get(index).setName(name);
            patients.get(index).setAge(age);
            patients.get(index).setTemperature(temp);
            patients.get(index).setHeartRate(heartRate);
            System.out.println("Patient updated.");

         } else if (choice == 4) {
            for (int i = 0; i < patients.size(); i++) {
               System.out.println((i + 1) + ". " + patients.get(i));
            }
            System.out.print("Enter patient number to remove: ");
            int index = keyboard.nextInt() - 1;
            keyboard.nextLine();
            patients.remove(index);
            System.out.println("Patient removed.");

         } else if (choice == 5) {
            try {
               PrintWriter writer = new PrintWriter(new File("patients.txt"));
               for (int i = 0; i < patients.size(); i++) {
                  writer.println(patients.get(i).toFileString());
               }
               writer.close();
            } catch (FileNotFoundException e) {
               System.out.println("Error saving file.");
            }
            System.out.println("Goodbye!");

         } else {
            System.out.println("Invalid choice.");
         }
      }

      keyboard.close();
   }
}