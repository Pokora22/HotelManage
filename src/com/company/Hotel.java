package com.company;

import java.util.LinkedList;

public class Hotel {
    private LinkedList<Room> rooms;
    private LinkedList<Customer> customers;
    private LinkedList<Booking> bookings;
    private LinkedList<Cleaner> cleaners;

    public Hotel(LinkedList<Room> rooms, LinkedList<Customer> customers, LinkedList<Booking> bookings, LinkedList<Cleaner> cleaners) {
        this.rooms = rooms;
        this.customers = customers;
        this.bookings = bookings;
        this.cleaners = cleaners;
    }

    public LinkedList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(LinkedList<Room> rooms) {
        this.rooms = rooms;
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(LinkedList<Customer> customers) {
        this.customers = customers;
    }

    public LinkedList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(LinkedList<Booking> bookings) {
        this.bookings = bookings;
    }

    public LinkedList<Cleaner> getCleaners() {
        return cleaners;
    }

    public void setCleaners(LinkedList<Cleaner> cleaners) {
        this.cleaners = cleaners;
    }
}
