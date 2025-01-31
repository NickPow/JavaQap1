// Purpose: This class is used to store the date of a transaction. It has methods to set and get the date, and return a string representation of the date.
// Author: Nicholas Power
// Date: Jan, 30, 2025

public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor to initialize day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Sets the date
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns the date in "dd/mm/yyyy" format
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
