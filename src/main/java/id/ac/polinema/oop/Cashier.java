package id.ac.polinema.oop;


public class Cashier {

    
     *
     * @param order 
     * @param cash  
     * @return 
    public double calculateChange(Order order, double cash) {
        if (order == null) {
            return 0.0;
        }

        double finalTotal = order.getFinalTotal();

    
        if (cash >= finalTotal) {
            return cash - finalTotal;
        }

        
        return 0.0;
    }
}