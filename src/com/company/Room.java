package com.company;

import java.time.LocalDate;
import java.util.LinkedList;

public class Room {
    private RoomCategory category;
    private LinkedList<Booking> bookings;
    private boolean occupied, clean;

    public Room(RoomCategory category) {
        this.category = category;
        bookings = new LinkedList<>();
    }

    public float calculatePrice(LocalDate startDate, LocalDate endDate){
        float price = 0;
        float catPrice = category.getPrice();
        float[] season = category.getSeasonMultiplier();
        LocalDate currentCheck = startDate;

        for(LocalDate checkDate = startDate; checkDate.isBefore(endDate.plusDays(1)); checkDate = checkDate.plusDays(1))
            price += catPrice * season[checkDate.getMonthValue() - 1];

        return price;
    }

    public boolean matches(LocalDate startDate, LocalDate endDate, RoomCategory category){
        for(Booking booking : this.bookings){
            if(booking.getEndDate().isBefore(startDate) &&
                    this.category == category &&
                    bookings.get(bookings.indexOf(booking) + 1).getStartDate().isAfter(endDate)) return true;
        }

        return false;
    }

    public void addBooking(Booking booking){
        if(bookings.size() > 0) {
            for (Booking b : bookings) if (b.getStartDate().isAfter(booking.getStartDate())) {
                    bookings.add(bookings.lastIndexOf(b), booking);
                    return;
                }

            bookings.add(booking);
        }

        else bookings.add(booking);
    }

    public RoomCategory getCategory() {
        return category;
    }

    public void setCategory(RoomCategory category) {
        this.category = category;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public LinkedList<Booking> getBookings() {
        return bookings;
    }
}
