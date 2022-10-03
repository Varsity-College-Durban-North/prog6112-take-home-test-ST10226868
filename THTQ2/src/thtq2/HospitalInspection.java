
package thtq2;


public class HospitalInspection extends Inspection {
    //constructor for the class
 public  HospitalInspection(String HospitalLocation, String HospitalName, int years){
      super(HospitalLocation, HospitalName,years );
 }

  

 //using this method to print the details of the hospital
public void InspectionReport(){
    System.out.println("Hospital Report");
    System.out.println("**********");
    System.out.println("The hospital's location is"+ this.HospitalLocation);
    System.out.println("The hospital name is" + this.HospitalName);
    System.out.println("Years since last inspection" + this.years);
}
//overriding all get methods 
    @Override
    public String getHospitalLocation() {
     return null;
    }

    @Override
    public String getHospitalName() {
        
     return null;
        
    }

    @Override
    public int getYearsSinceInspection() {
 
     return 0;
        
    }

    @Override
    public String getInspectionNeeded() {
   
     return null;
   
    }
    

   
}