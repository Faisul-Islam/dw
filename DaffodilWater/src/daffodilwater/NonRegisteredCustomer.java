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
public class NonRegisteredCustomer extends Customer{

    public NonRegisteredCustomer() {
    }

    public NonRegisteredCustomer(String name, int id) {
        super(name, id);
    }

    @Override
    void giveOrder(int amount,int orderId) {
        if(amount > 1000 ){
            Order o = new Order(orderId, amount);
                        System.out.println(getName() + " of id " + getId() + " Succesfully ordered " + amount + " water bottles.");

        }
    }
    
}
