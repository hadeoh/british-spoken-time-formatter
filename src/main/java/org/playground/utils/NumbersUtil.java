package org.playground.utils;

public final class NumbersUtil {

  private NumbersUtil() {}

  private static String[] TIME_INDEXES = {
    "twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven"
  };

  private static String[] MINUTES_IN_WORDS = {
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

  public static String hourInWords(int hour) {
    return TIME_INDEXES[hour % 12];
  }

  public static String minuteInWords(int minute) {
    return MINUTES_IN_WORDS[minute];
  }
}
