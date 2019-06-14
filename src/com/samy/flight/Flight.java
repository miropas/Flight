package com.samy.flight;

public class Flight {
    private int passengers,flightNumber,seats = 150 ;
    private char flightClass;
    private boolean[] isSeatAvailable ;
    // initialization block
    {
        isSeatAvailable = new boolean[seats] ;
        for(int i=0;i<seats;i++)
           isSeatAvailable[i] = true; 
        }

    public Flight() {
    }
    public Flight(int flightNumber) {
       this(); 
       this.flightNumber = flightNumber ;
    }
    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass ;
    }
    
}
