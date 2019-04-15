package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room r1;
    RoomCategory std;
    Customer customer;

    @BeforeEach
    void setUp() {
        std = new RoomCategory(100, 1, 1, 1, 1.2f, 1.2f, 1.2f, .8f, .8f, .8f, 1.5f, 1.5f, 1.5f);
        customer = new Customer();
        r1 = new Room(std);

        r1.addBooking(new Booking(customer, LocalDate.of(2010, 1, 1), LocalDate.of(2010,1,11)));
        r1.addBooking(new Booking(customer, LocalDate.of(2010, 3, 3), LocalDate.of(2010,3,13)));
    }

    @Test
    void matchesReturnsCorrectly() {
        assertTrue(r1.matches(LocalDate.of(2010, 1, 20), LocalDate.of(2010, 1, 25), std));
    }

    @Test
    void addBookingAddsSorted() {
        Booking middleBooking = new Booking(customer, LocalDate.of(2010, 2, 1), LocalDate.of(2010,2,12));

        r1.addBooking(middleBooking);

        assertEquals(1, r1.getBookings().indexOf(middleBooking));
    }

    @Test
    void calculatePriceReturnsCorrectPrice() {
        assertEquals(1360,r1.calculatePrice(LocalDate.of(2010, 3, 28), LocalDate.of(2010, 4, 8)));
    }
}