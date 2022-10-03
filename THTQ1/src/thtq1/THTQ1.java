//Thabani shabalala
//ST10226868
//Take home test 1
//Question 1
package thtq1;
import java.util.Scanner;
 public class THTQ1 {
     
     
    public static void main(String[] args) {
      
            // variables  for the required calculations
            int total=0,total2=0,total3=0,mt=0,mt2=0,mt3=0;
            int sales[][]={{4,8,6},{5,4,2},{4,2,8}};

            System.out.println("****************");
            System.out.println("\tHOSPITAL INSPECTION REPORT");
            System.out.println("****************");
            System.out.println(" \t\tJAN \tFEB \tMAR \tTotal");
            // printing each hospital inspection
                System.out.print("Hospital 1 \t");
                    for(int j=0;j<=2;j++)
                        {
                            System.out.print(sales[0][j]+" \t");
                                // calculating total for hospital 1
                                total=total+sales[0][j];
                        }
                    System.out.println(total);

                System.out.print("Hospital 2 \t");
                    for(int j=0;j<=2;j++)
                        {
                            System.out.print(sales[1][j]+" \t");
                            // calculating total for hospital 2
                                total2=total2+sales[1][j];
                        }
                    System.out.println(total2);

                System.out.print("Hospital 3 \t");
                    for(int j=0;j<=2;j++)
                        {
                            System.out.print(sales[2][j]+" \t");
                            // calculating total for hospital 3
                                total3=total3+sales[2][j];
                        }
                    System.out.println(total3);
            System.out.println("*****************");
// calculating per monthly averages
        for(int j=0;j<=2;j++)
                mt=mt+sales[j][0];
        for(int j=0;j<=2;j++)
                mt2=mt2+sales[j][1];
        for(int j=0;j<=2;j++)
                mt3=mt3+sales[j][2];

            System.out.println("MONTHLY TOTAL \t" +mt+" \t"+mt2+" \t"+mt3);
            System.out.println("******************");
    }
    
}
 
    
    
                
    

