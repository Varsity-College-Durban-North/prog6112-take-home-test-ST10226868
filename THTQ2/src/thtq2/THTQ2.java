//Thabani shabalala
//ST10226868
//Take home test 1
//Question 2
package thtq2;

import java.util.Scanner;
public class THTQ2 {

    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    
      //user enters details 
        System.out.println("Enter Hospital location");
        String HospitalLocation= input.nextLine;
              
         System.out.println("Enter Hospital name");
        String HospitalName= input.nextLine;
        
         System.out.println("Enter years since last inspection");
        String years= input.nextLine;
              
              //method call
              HospitalInspection hospital = new HospitalInspection(HospitalLocation,HospitalName,0);
     hospital.InspectionReport();
     hospital.getInspectionNeeded();
    }
    
}
