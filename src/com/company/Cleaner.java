package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Cleaner {
    private HashMap<LocalDateTime, Room> schedule;

    public void updateSchedule(LocalDateTime timeSlot, Room room){
        schedule.put(timeSlot, room);
    }

    public boolean isFree(LocalDateTime time){
        return (schedule.get(time).equals(null));
    }

    public void request(Room room){
        LocalDateTime dayLimit = LocalDate.now().atStartOfDay().plusDays(1);
        LocalDateTime check = LocalDate.now().atStartOfDay();

        while(check.isBefore(dayLimit)){
            if(isFree(check)) {
                updateSchedule(check, room);
                return;
            }
            check = check.plusHours(1);
        }
    }
}
