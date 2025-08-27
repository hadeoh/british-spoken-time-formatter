package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

public class OClockImpl implements SpokenTimeInterface {

    @Override
    public boolean supports(LocalTime time) {
        return time.getMinute() == 0;
    }

    @Override
    public String speakBritishTime(LocalTime time) {
        return TIME_INDEXES[time.getHour() % 12] + "o'clock";
    }
}
