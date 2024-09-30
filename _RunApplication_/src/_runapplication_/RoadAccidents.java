/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _runapplication_;

/**
 *
 * @author damia
 */
public abstract class RoadAccidents implements IRoadAccidents  {
    
    
   private static  String AccidentvehicleType;
 private   static String City;
 private    static int AccidentTotal;

 //can access in another class
    public RoadAccidents() {
    }

 
 
 
 
    public RoadAccidents(String vehicleType,String city, int accidents) {
        
        AccidentvehicleType =vehicleType;
        City = city;
        AccidentTotal = accidents;
       
        
    }

   @Override
    public String getAccidentvehicleType() {
        return AccidentvehicleType;
    }

   @Override
    public  String getCity() {
        return City;
    }

   @Override
    public int getAccidentTotal() {
        return AccidentTotal;
    }

    
  

    

   
   
   
    
    
    
}
