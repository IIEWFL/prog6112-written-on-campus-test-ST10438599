/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _runapplication_;

/**
 *
 * @author damia
 */
public class RoadAccidentReport extends RoadAccidents{
    
    
    RoadAccidents obj = new RoadAccidents() {} ;

    public RoadAccidentReport(String vehicleType, String city, int accidents) {
        super(vehicleType, city, accidents);
    }
    
    
    
    public static void printAccidentReport(){
        
        String header = "VEHICLE ACCIDENT REPORT";
        String asterix = "*******************************";
        
        System.out.println("VEHICLE TYPE : " + obj.getAccidentvehicleType());
        System.out.println("CITY : " + getCity());
        System.out.println("ACCIDENT TOTAL :" + obj.getAccidentTotal());
        
        
        
    }
    
    

   
    
    
    
    
    
}
