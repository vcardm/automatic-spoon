/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class Payment {
    //emum of payment types 
    private PaymentType type;
    private double amount;

    /**
     * constructor
     * @param type
     * @param amount
     */
    public Payment(PaymentType type, double amount){ 
        this.type=type;
        this.amount=amount;
    }

    /**
     * get  and set payment type 
     * @return
     */
    public PaymentType getType(){
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(PaymentType type){
        this.type=type;
    }

    /**
     * get and set amount 
     * @return
     */
    public double getAmount(){
        return amount;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(double amount){
        this.amount=amount;
    }
    
}
