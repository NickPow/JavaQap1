// Purpose: Define the Time class with methods to advance, move back, and return a string representation of the time.
// Author: Nicholas Power
// Date: Jan, 30, 2025

public class Time {
    private int hour; // Hours in 24-hour format (0–23)
    private int minute; // Minutes (0–59)
    private int second; // Seconds (0–59)

    // Constructor to initialize hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Advance to the next second
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    // Move to the previous second
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
        }
        if (minute < 0) {
            minute = 59;
            hour--;
        }
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }

    // Returns the time in "hh:mm:ss" format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
