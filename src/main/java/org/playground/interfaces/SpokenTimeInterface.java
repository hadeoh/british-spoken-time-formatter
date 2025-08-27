package org.playground.interfaces;

import java.time.LocalTime;

public interface SpokenTimeInterface {

  String[] TIME_INDEXES = {
    "twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven"
  };

  String[] MINUTES_IN_WORDS = {
    "",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen",
    "twenty",
    "twenty one",
    "twenty two",
    "twenty three",
    "twenty four",
    "twenty five",
    "twenty six",
    "twenty seven",
    "twenty eight",
    "twenty nine",
    "thirty",
    "thirty one",
    "thirty two",
    "thirty three",
    "thirty four"
  };

  boolean supports(LocalTime time);

  String speakBritishTime(LocalTime time);
}
