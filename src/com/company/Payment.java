package com.company;

public class Payment {
    private Booking booking;
    private float paid;

    public boolean process(Customer customer, float price, Booking booking){
        this.booking = booking;
        float toPay = customer.calculateDiscount(price);

        //Process payment
        boolean validated = validate();
        if(validated) customer.recordPayment(this);
        return validated;
    }

    public void process(float price, Customer customer){
        float toPay = customer.calculateDiscount(price);
        refund(paid - toPay);
    }

    private boolean validate(){
        //Validate manually if cash, or through bank if using card
        return true;
    }

    private void refund(float price){
        //Issue bank refund for paid - price
    }
}
