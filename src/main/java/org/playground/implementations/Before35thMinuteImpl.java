package org.playground.implementations;

import org.playground.interfaces.SpokenTimeInterface;

import java.time.LocalTime;

public class Before35thMinuteImpl implements SpokenTimeInterface {

    @Override
    public boolean supports(LocalTime time) {
        // Covers cases that are before 35th minute
        int minute = time.getMinute();
        return minute > 30 && minute < 35;
    }

    @Override
    public String speakBritishTime(LocalTime time) {
        return TIME_INDEXES[time.getHour() % 12] + " " + MINUTES_IN_WORDS[time.getMinute()];
    }
}
