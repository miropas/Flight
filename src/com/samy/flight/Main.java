package com.samy.flight;

public class Main {

    public static void main(String[] args) {
        Passenger july = new Passenger(34);
        System.out.println("july has " + july.getFreeBags() + " free bags");
        Flight f744= new Flight();
        f744.setSeats(551);
        System.out.println("Flight 744 has "+ f744.getSeats()+ " seats");



    }
}
