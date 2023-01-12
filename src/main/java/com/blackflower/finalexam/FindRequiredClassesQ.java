package com.blackflower.finalexam;

/**
 *
 * @author emirs
 */
public class FindRequiredClassesQ {}

interface IMaterial{
    void sellProduct(int price);
    void sellProduct(int price, Customer c);
}

class Pen implements IMaterial{
    
    public Pen(int price){}
    
    @Override public void sellProduct(int price) {}
    @Override public void sellProduct(int price, Customer c) {}
}

class Eraser implements IMaterial{
    
    @Override public void sellProduct(int price) {}
    @Override public void sellProduct(int price, Customer c) {}
}

class Customer{
    public Customer(String firstName, String lastName) {}
}

class Sales{
    public Sales(IMaterial... materials){}
    public Sales(IMaterial k, IMaterial m){}
}