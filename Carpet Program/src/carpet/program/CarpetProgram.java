/*
 *March 1
 *Calculates the cost of a carpet based on hard-coded width and length
 */

package carpet.program;

/**
 *
 * @author eli
 */
public class CarpetProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String output1 = "The carpeting job will cost: ";//creates text for the output string
        
     // define the dimensions of the carpet           
        double width = 8.5;
        double length = 6;
        
        //determine area of carpet and using price per square meter, determine cost
        double area = width*length;
        double cost = area*19.95;
        //turns the product of cost*area into a double with 2 decimal spaces
        cost = Math.round(cost*100.0)/100.0;
        
        //outputs cost
        System.out.println(output1 + cost + " dollars");
    }
    
}
