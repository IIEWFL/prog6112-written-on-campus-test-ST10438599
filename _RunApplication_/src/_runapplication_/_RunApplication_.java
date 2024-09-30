/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _runapplication_;

import java.util.Scanner;

/**
 *
 * @author damia
 */
public class _RunApplication_ {

   
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         RoadAccidents obj = new RoadAccidents() {} ;

        System.out.println("Enter the accident vehicle type  : ");
        String accVehicle = input.next();

        System.out.println("Enter the city for the vehicle accidents  : ");
        int city = input.nextInt();
        
        System.out.println("Enter the total car accidents for  " + obj.getCity() + ":" );
        int total = input.nextInt();
        
         RoadAccidentReport obj1 = new RoadAccidentReport(accVehicle,city,total);
        
        
        
       obj1.printAccidentReport();
        
        
        
    }
    
}
