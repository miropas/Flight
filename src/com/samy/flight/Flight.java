package com.samy.flight;

public class Flight {
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    boolean[] isSeatAvailable;

    // initialization block
    {
        isSeatAvailable = new boolean[seats];
        //  for (int i = 0; i < seats; i++)
        for (boolean seat : isSeatAvailable)
            //  isSeatAvailable[i] = true;
            seat = true;
    }

    public Flight() {
    }

    public Flight(int flightNumber) {
        this();
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this();
        this.flightClass = flightClass;
    }

    public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
    }

    public boolean hasSeating() {
        return passengers < seats;
    }

    private void handleTooMany() {
        System.out.println("Too many");
    }


}
