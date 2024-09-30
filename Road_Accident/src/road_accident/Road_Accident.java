/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package road_accident;

import java.util.Scanner;

/**
 *
 * @author damia
 */
public class Road_Accident {
 static int [][] accidents = new int [3][2];
 
 static String [] headings = {"CAR","MOTOR BIKE"}; 
 
  static String  [] subHead = {"Cape Town","Johannesburg","Port Elizabeth"};
 
 
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the number of car accidents in Cape Town:");
        int carCPT = input.nextInt();
        carCPT = accidents[0][0];
        System.out.println("Enter the number of motor bike accidents in Cape Town:");
        int bikeCPT = input.nextInt();
        bikeCPT = accidents[0][1];
        System.out.println("Enter the number of car accidents in Johannesburg:");
        int carJHB = input.nextInt();
        carCPT = accidents[1][0];
        System.out.println("Enter the number of motor bike accidents in Johannesburg:");
        int bikeJHB = input.nextInt();
        bikeCPT = accidents[1][1];
        System.out.println("Enter the number of car accidents in Port Elizabeth:");
        int carPE = input.nextInt();
        carCPT = accidents[2][0];
        System.out.println("Enter the number of motor bike accidents in Port Elizabeth:");
        int bikePE = input.nextInt();
        bikeCPT = accidents[2][1];
        
        
        
        
        for (int row = 0; row < accidents.length; row++) {

        // Sum all the elements in the current row
        for (int column = 0; column < accidents[row].length; column++) {
            
            
            
            
            int name = accidents[row][column];
        }

    }
        
        
        
        
    }
    
    
    
    
    public static int[] Total(int[][] accidents) {
    // Initialize the average array to store averages for each row
    int[] total = new int[accidents.length];

    // Iterate through each row
    for (int row = 0; row < accidents.length; row++) {
        int sum = 0;  // Initialize sum for each row
        int count = accidents[row].length;  // Number of elements in the row

        // Sum all the elements in the current row
        for (int column = 0; column < accidents[row].length; column++) {
            sum += accidents[row][column];
        }

        // Calculate the average for this row and store it in the array
        total[row] = sum ;
    }

    // Return the array of row averages
    return total;
}
    
     //find maximum value 
    public static  int getMax() {

        //set max to be the first value in data array
        int max = accidents[0][0];
        //iterate through array ,adding together the values
        for (int row = 0; row < accidents.length; row++) {

            //iterate from one column to the next in the same row 
            for (int col = 0; col < accidents[row].length; col++) {

                if (max < accidents[row][col]) {

                    max = accidents[row][col];

                }

            }

        }
        return max;

    }
    
    
    
     public static void report(){
        String asterix = "*************************************";
        String header = "ROAD";
        String subhead = "MONTHLY TOTALS";
        
        System.out.println(asterix);
        System.out.println(header);
         System.out.println(asterix);
        String sub = String.format("%-15s %-10s %-10s " , "" , headings[0],headings[1]);
        System.out.println(sub);
        
      
        String output = "";

        for (int i = 0; i < accidents.length; i++) {
            // Format the row data including the average
            output +=  String.format("%-15s %-10d %-10d %-10d\n",
                    subHead[i], accidents[i][0], accidents[i][1], accidents[i][2]);
        }

        // Print the report content
        System.out.println(output);
         System.out.println(asterix);
         System.out.println(subhead);
          System.out.println(asterix);
          
          int[] total = Total(accidents);
          String lt = "";
          
          for (int x = 0; x < accidents.length; x++) {
              
              
             lt  += String.format("%-15s %-10d\n",subHead[x],total[x]);
              
            
        }
        
        System.out.println(lt);
        int mostAccidents = getMax();
        
         System.out.println("CITY WITH THE MOST VEHICL ACCIDENTS : " + accidents[mostAccidents]);
        
        
        
        System.out.println(asterix);
        
        
        
        
    }
    
    
    
    
    
    
}
