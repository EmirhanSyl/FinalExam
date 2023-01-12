package com.blackflower.finalexam;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class OOPQ {}


class Company{
    ArrayList<Customer> customers = new ArrayList<>();
    
    // 3.c
    ArrayList<Customer> findNoDiscountCustomers(){
        ArrayList<Customer> noDiscountCustomers = new ArrayList<>();
        
        for (Customer customer : customers) {
            boolean haveNoDiscount = true;
            for (Sales sale : customer.sales) {
                if (sale instanceof DiscountedSales) {
                    haveNoDiscount = false;
                }
            }
            if (haveNoDiscount) {
                noDiscountCustomers.add(customer);
            }
        }
        return noDiscountCustomers;
    }
}

class Customer{
    Sales[] sales;
    
    String firstName;
    String lastName;
    
    // 3.b
    int getTotalDiscount(){
        int totalDiscount = 0;
        for (Sales sale : sales) {
            if (sale instanceof DiscountedSales) {
                DiscountedSales dSales = (DiscountedSales)sale;
                totalDiscount += dSales.getSpecialDiscount();
            }
        }
        return  totalDiscount;
    }
}

// 2.b
//For make getPrice method abstract:
//Change Sales class to an interface or abstract class
//Then implement getPrice method in sub or implemented classes
class Sales{
    int getPrice(){
        return 0; // Returns smth but we dont care
    }
}

class DiscountedSales extends Sales{
    // 2.a
    public String reason; 
    
    int getSpecialDiscount(){
        return 0; // Returns smth but we dont care
    }
    
    // 3.a
    @Override
    int getPrice(){
        return super.getPrice() - getSpecialDiscount();
    }
}

class NormalSales extends Sales{
    
    //2.c
    class SalesCostumers extends Customer{
        
    }
}

// 3.d
class Test{
    public static void main(String[] args) {
        Sales dSale1 = new DiscountedSales();
        Sales nSale1 = new NormalSales();
        
        Sales[] sales = {dSale1, nSale1};
        // or it can be done like that -> Sales[] sales = {new DiscountedSales(), new NormalSales()};
        
        Customer customer = new Customer();
        customer.sales = sales;
        System.out.println(customer.getTotalDiscount());
    }
}