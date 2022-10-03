package thtq2;

//this class is being implemented from the iInspection class
public abstract class Inspection implements iInspection {
    
    public Inspection(String HospitalLocation, String HospitalName, int years){
         
        this.HospitalLocation = HospitalLocation;
        this.HospitalName = HospitalName;
        this.years = years;
       
}
//varibles to store data
   String HospitalLocation;
   String HospitalName;
    int years;
    private String InspectionNeeded;

    public String getHospitalLocation() {
        return HospitalLocation;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public int getYears() {
        return years;
    }

    public String getInspectionNeeded() {
        return InspectionNeeded;
    }
    
    
  
}
