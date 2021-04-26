
package javafxapplication2;


public class Customer {
    
    public String name;
    public double investAmt; // investment amount
    public double rate;
    public int time; // in years

    public Customer(String name, double investAmt, double rate, int time) {
        this.name = name;
        this.investAmt = investAmt;
        this.rate = rate;
        this.time = time;
    }
    
    public double calcInterest(){
        return investAmt*rate*time/100.00;
                
     }
    
    
    
    
    
    
    
    
    
    
    
    
}




