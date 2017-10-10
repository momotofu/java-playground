package com.company;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {

    // Properties
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 0.24;

    // Constructor
    public LibraryCatalog(Map<String, Book> bookCollection, int lengthOfCheckOutPeriod, double initialLateFee
    , double feePerLateDay) {
         this.bookCollection = bookCollection;
         this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
         this.initialLateFee = initialLateFee;
         this.feePerLateDay = feePerLateDay;
    }

    public LibraryCatalog(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    // Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public int getLengthOfCheckOutPeriod() {
        return this.getLengthOfCheckOutPeriod;
    }


    public double getInitialLateFee() {
        return this.initialLateFee;
    }


    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    // Setters
}
