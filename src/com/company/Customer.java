package com.company;

import java.awt.print.Book;
import java.util.LinkedList;

public class Customer {
    private String name, email;
    private float discount;
    private LinkedList<Payment> payments;
    private LinkedList<Booking> bookings;

    public Customer() {
        this.name = "";
        this.email = "";
        this.discount = 0;
        this.payments = new LinkedList<>();
        this.bookings = new LinkedList<>();
    }

    public Customer(String name, String email, float discount, LinkedList<Payment> payments, LinkedList<Booking> bookings) {
        this.name = name;
        this.email = email;
        this.discount = discount;
        this.payments = payments;
        this.bookings = bookings;
    }

    public void fillDetails(String name, String email){
        this.name = name;
        this.email = email;
    }

    public float calculateDiscount(float price){
        return price * (1 - discount);
    }

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }

    public void recordPayment(Payment payment){
        this.payments.add(payment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public LinkedList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(LinkedList<Payment> payments) {
        this.payments = payments;
    }

    public LinkedList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(LinkedList<Booking> bookings) {
        this.bookings = bookings;
    }
}
