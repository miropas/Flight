package com.samy.flight;

public class Main {

    public static void main(String[] args) {
       Flight f=new Flight();
	System.out.println(f.isSeatAvailable.length);
	for(boolean seat:f.isSeatAvailable)
        System.out.println(f.hasSeating());

    }
}
