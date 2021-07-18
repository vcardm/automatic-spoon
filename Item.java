/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valentina
 */
public class Item {
    //items name
    private String name;
    //items prive
    private double price;

    /**
     * constructor
     * @param name
     * @param price
     */
    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }
    
    //get and set name

    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    
    //get and set price

    /**
     *
     * @return
     */
    public double getPrice(){
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price){
        this.price=price;
    }
    
    public String toString(){
        return name + ":" +price;
    }
}

