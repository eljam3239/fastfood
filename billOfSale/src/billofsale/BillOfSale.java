/*
 * March 1
 *creates a bill based on the taxes, price,total and change
 */

package billofsale;

/**
 *
 * @author eli
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ogprice = 12.49; //price of shirt
        double payment = 20; //bill used to pay
        double tax = 1.13; //value of tax
        double total_cost = ogprice*tax; //total cost with tax
        double change = payment-total_cost; //change returned
        change = Math.round(change*100.0)/100.0; //makes change a decimal with 2 places
        total_cost = Math.round(total_cost*100.0)/100.0; //makes total_cost a deciaml with 2 places
        
        System.out.println("You payed for your " + ogprice + " dollar shirt with a " + payment + " dollar bill.\n With taxes of 13 percent, your bill came to " + total_cost + " dollars.\n You received "+change+" dollars in change.");
      
                
               
        
    }
    
}
