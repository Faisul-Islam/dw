/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daffodilwater;
import daffodilwater.RegisteredCustomer;
/**
 *
 * @author mahin
 */
public class DaffodilWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        NonRegisteredCustomer nonReg[] = new NonRegisteredCustomer[100];
        RegisteredCustomer reg[] = new RegisteredCustomer[100];
        
        int orderId = 0,totalReg = 0, totalSupervidor = 0;
        Supervisor sup = new Supervisor("Faisul", 1);
        
        
        reg[totalReg] = new RegisteredCustomer("suhid", totalReg);
        reg[totalReg].giveOrder(5001, orderId++);
        System.out.println(reg[totalReg].getTotalOrderedAmount());
        totalReg++;
        reg[totalReg] = new RegisteredCustomer("Mahin", totalReg);
        reg[totalReg].giveOrder(1001, orderId++);
        System.out.println(reg[totalReg].getTotalOrderedAmount());
        totalReg++;
        
        
        NonRegisteredCustomer nr = new NonRegisteredCustomer("karim", orderId++);
        nr.giveOrder(2000, 101);
        
        sup.supervise(reg, totalReg);
    }
    
}
