/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author valentina
 */
public class Transaction {
    private ArrayList<Item> items;
    private ArrayList<Payment> payments;
    private double subTotal;
    private double tax;
    private double total;
    private double change;

    /**
     * constructor for transaction
     */
    public Transaction(){
        this.items =new ArrayList<>();
        this.payments=new ArrayList<>();
    }

    /**
     * an array list of transaction item list 
     * @param items
     */
    public Transaction(ArrayList<Item> items){
        this.items=items;
        this.payments=new ArrayList<>();
    }

    /**
     * getters
     * @return
     */
    public ArrayList<Item> getItems(){
        return items;
    }
    
    //setter

    /**
     *
     * @param items
     */
    public void setItems(ArrayList<Item> items){
        this.items=items;
    }

    /**
     * the array list of the payments
     * @return
     */
    public ArrayList<Payment> getPayments(){
        return payments;
    }

    /**
     * set payment
     * @param payments
     */
    public void setPayments(ArrayList<Payment> payments){
        this.payments=payments;
    }

    /**
     * get and set subtotal
     * @return
     */
    public double getSubTotal(){
        return subTotal;
    }

    /**
     *
     * @param subTotal
     */
    public void setSubTotal(double subTotal){
        this.subTotal=subTotal;
    }
    
    //get and set tax

    /**
     *
     * @return
     */
    public double getTax(){
        return tax;
    }

    /**
     *
     * @param tax
     */
    public void setTax(double tax){
        this.tax = tax;
    }
    
    //get and set total 

    /**
     *
     * @return
     */
    public double getTotal(){
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(double total){
        this.total=total;
    }
    
    //get and set change

    /**
     *
     * @return
     */
    public double getChange(){
        return change;
    }

    /**
     *
     * @param change
     */
    public void setChange(double change){
        this.change=change;
    }
    
    /**
     * calculate subtotal
     */
    public void calculateSubTotal(){
        items.forEach((item) ->{
            subTotal +=item.getPrice();
        });
    }

    /**
     * calculate tax
     */
    public void calculateTax(){
        tax=subTotal*0.07;
    }
    

    /**
     * calculate total
     */
    public void calculateTotal(){
        total=subTotal+tax;
        total = Math.round(total * 100.0) / 100.0;
    }

    /**
     * asking for the payment method
     */
    public void takePayment(){
    Scanner scnr =new Scanner(System.in);
    do{
            System.out.println("Please enter the payment type.\n1. Cash\n2. " + "Debit Card\n3. Credit Card\n4. Check");
            int payOption=scnr.nextInt();
            switch (payOption){
        
        //case one: cash
        case 1: 
        {
         double payAmount;
                    PaymentType payment = PaymentType.CASH;
                    System.out.print("Enter the amount to pay with this type.\n");
                    payAmount = scnr.nextDouble();
                    Payment payObj = new Payment(payment, payAmount);
                    payments.add(payObj);
                    total = total-payAmount;
                    if (total<0){
                        change = Math.abs(total);
                    }
                    System.out.println("Total after payment: " + total);
                    break;
                }
        //case two: debit
        case 2: 
        {
         double payAmount;
                    PaymentType payment = PaymentType.DEBIT_CARD;
                    System.out.print("Enter the amount to pay with this type.\n");
                    payAmount = scnr.nextDouble();
                    Payment payObj = new Payment(payment, payAmount);
                    payments.add(payObj);
                    total = total-payAmount;
                    if (total<0){
                        change = Math.abs(total);
                    }
                    System.out.println("Total after payment: " + total);
                    break;
                }
        //case three: credit
        case 3: 
        {
         double payAmount;
                    PaymentType payment = PaymentType.CREDIT_CARD;
                    System.out.print("Enter the amount to pay with this type.\n");
                    payAmount = scnr.nextDouble();
                    Payment payObj = new Payment(payment, payAmount);
                    payments.add(payObj);
                    total = total-payAmount;
                    if (total<0){
                        change = Math.abs(total);
                    }
                    System.out.println("Total after payment: " + total);
                    break;
                }
        //case four: check
        case 4: 
        {
         double payAmount;
                    PaymentType payment = PaymentType.CHECK;
                    System.out.print("Enter the amount to pay with this type.\n");
                    payAmount = scnr.nextDouble();
                    Payment payObj = new Payment(payment, payAmount);
                    payments.add(payObj);
                    total = total-payAmount;
                    if (total<0){
                        change = Math.abs(total);
                    }
                    System.out.println("Total after payment: " + total);
                    break;
                }
                default: 
                    break;
            }
        }while(total>0);
    }
}

