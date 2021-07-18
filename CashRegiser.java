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

public class CashRegiser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //list the items and paymeny 
        System.out.println("The items you wish to purchase and payment method:");
        
        //items list, 1,2,3,4
        Item item1 = new Item("apple", 0.50);
        Item item2 = new Item("pear", 0.75);
        Item item3 = new Item("pineapple", 0.75);
        Item item4 = new Item("refrigerator", 800.71);
        
        //an array list of the items 
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        
        String itemList="";
        int count =1;
        for (Item i: items){
            itemList+= "item" + count +": " + i.toString()+ "\n";
            count++;
        }
            
         //print out the list 
         System.out.println(itemList);
         
         //initating the transaction 
         Transaction paymentTransaction = new Transaction(items);
         paymentTransaction.calculateSubTotal();
         paymentTransaction.calculateTax();
         paymentTransaction.calculateTotal();
         
         //print out the total 
         System.out.println("Total: " + paymentTransaction.getTotal());
         paymentTransaction.takePayment();
         Receipt receipt = new Receipt(paymentTransaction);
         System.out.println(receipt.getReceiptString());
        }
    }
    
  