/*
   *March 1, 2017
   *Carpet Cost
   *calculates the cost to carpet a specified area
 
 */

package carpet.cost;

/**
 *
 * @author eljam3239
 */
public class CarpetCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 8.5;
        double length = 6;
        double area =  width*length;
        double cost = area*19.95;
        //removes decimal digits past 2 places
        
        System.out.print("The carpet will cost " + cost + " dollars");
    }
    
}
