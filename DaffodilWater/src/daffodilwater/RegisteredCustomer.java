/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daffodilwater;

/**
 *
 * @author mahin
 */
public class RegisteredCustomer extends Customer{
    
    private  int totalOrderedAmount;

    public RegisteredCustomer() {
    }

    public RegisteredCustomer(String name, int id) {
        super(name, id);
    }

    public int getTotalOrderedAmount() {
        return totalOrderedAmount;
    }

    public void setTotalOrderedAmount(int totalOrderedAmount) {
        this.totalOrderedAmount = totalOrderedAmount;
    }
    
    
    

    @Override
    void giveOrder(int amount,int orderId) {
        if(amount > 1000 ){
            Order o = new Order(orderId, amount);
            setTotalOrderedAmount(getTotalOrderedAmount() + o.getOrderedAmount());
                        System.out.println(getName() + " of id " + getId() + " Succesfully ordered " + amount + " water bottles.");

        }
    }
    
}
