package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Cleaner {
    private HashMap<LocalDateTime, Room> schedule;

    public Cleaner() {
        this.schedule = new HashMap<>();
    }

    public void updateSchedule(LocalDateTime timeSlot, Room room){
        schedule.put(timeSlot, room);
    }

    public boolean isFree(LocalDateTime time){
        return (null == schedule.get(time));
    }

    public void request(Room room){
        LocalDateTime check = LocalDate.now().atStartOfDay().plusHours(8); //from 8am to 8pm
        LocalDateTime dayLimit = check.plusHours(12);

        while(check.isBefore(dayLimit)){
            if(isFree(check)) {
                updateSchedule(check, room);
                return;
            }
            check = check.plusHours(1);
        }
    }

    public HashMap<LocalDateTime, Room> getSchedule() {
        return schedule;
    }
}
