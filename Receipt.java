/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class Receipt {
    final Transaction transaction;
    
    //constructor

    /**
     *
     * @param transaction
     */
    public Receipt (Transaction transaction){
        this.transaction = transaction;
    }
    
    //transaction 

    /**
     *
     * @return
     */
    public Transaction getTransaction(){
        return transaction;
    }
    
    //method

    /**
     *
     * @return
     */
    public String getReceiptString(){
        String itemList = "";
        double total = transaction.getSubTotal() + transaction.getTax();
        for(Item i: transaction.getItems()){
            itemList+=i.toString()+"\n";
        }
        String paymentType="";
        for(Payment a:transaction.getPayments()){
            if(null!=a.getType())switch(a.getType()){
                case CASH:
                    paymentType+="\nCash: "+'\t'+'\t'+a.getAmount();
                    break;
                case DEBIT_CARD:
                    paymentType+="\nDebit: "+'\t'+'\t'+a.getAmount();
                    break;
                case CREDIT_CARD:
                    paymentType+="\nCredit: "+'\t'+'\t'+a.getAmount();
                    break;
                case CHECK:
                    paymentType+="\nCheck: "+'\t'+'\t'+a.getAmount();
                    break;
                default:
                    break;
            }
        }
        //return statement
        return "\n" +itemList + "------------\n" + "Subtotal:" + '\t'+transaction.getSubTotal() 
                + "\nTax: " + '\t' + '\t' + transaction.getTax() + "\nTotal: " + '\t' + '\t' + total + 
                        paymentType + "\nChange: " + '\t' + transaction.getChange();
    }
}
