package com.company;

import java.time.LocalDate;
import java.util.LinkedList;

public class Booking {
    private Customer customer;
    private LocalDate startDate, endDate;
    LinkedList<Room> rooms;

    public Booking(Customer customer, LocalDate startDate, LocalDate endDate) {
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void recordRoomSelection(Room... rooms){
        for(Room room : rooms) this.rooms.add(room);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
