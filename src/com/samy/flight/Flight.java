package com.samy.flight;

public class Flight {
    private static int MAX_FAA_SEATS = 550;
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

    // constructors
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

    public void setSeats(int seats) {
        if (seats<MAX_FAA_SEATS)
        this.seats = seats;
        else
            System.out.println("maximum allowed seats is 550 ");
    }

    public int getSeats() {
        return seats;
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
