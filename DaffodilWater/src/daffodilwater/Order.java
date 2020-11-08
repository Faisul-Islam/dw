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
public class Order {
    
    final int PRICE = 102;
    private int orderId;
    private int orderedAmount;

    public Order(int orderId, int orderedAmount) {
        this.orderId = orderId;
        this.orderedAmount = orderedAmount;
    }

    
    public int getOrderId() {
        return orderId;
    }

    public int getOrderedAmount() {
        return orderedAmount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderedAmount(int orderedAmount) {
        this.orderedAmount = orderedAmount;
    }
    
  
    
}
