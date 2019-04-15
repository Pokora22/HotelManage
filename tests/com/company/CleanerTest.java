package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CleanerTest {
    Cleaner cleaner;
    Room r1, rtbc;


    @BeforeEach
    void setUp() {
        RoomCategory category = new RoomCategory(0,0,0,0,0,0,0,0,0,0,0,0,0);
        cleaner = new Cleaner();
        r1 = new Room(category);
        rtbc = new Room(category);

        cleaner.updateSchedule(LocalDate.now().atStartOfDay().plusHours(8), r1);
        cleaner.updateSchedule(LocalDate.now().atStartOfDay().plusHours(9), r1);
        cleaner.updateSchedule(LocalDate.now().atStartOfDay().plusHours(10), r1);
        cleaner.updateSchedule(LocalDate.now().atStartOfDay().plusHours(12), r1);
        cleaner.updateSchedule(LocalDate.now().atStartOfDay().plusHours(13), r1);
    }

    @Test
    void requestPutsTheRoomAtFirstFreeSlot() {
        cleaner.request(rtbc);
        assertEquals(rtbc, cleaner.getSchedule().get(LocalDate.now().atStartOfDay().plusHours(11)));
    }
}