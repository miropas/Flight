package com.samy.flight;

public class Main {

    public static void main(String[] args) {
        Flight f1 =new CargoFlight();
        CargoFlight cf1 = new CargoFlight();
         //f1.addPkgt(1,2,3);  wrong
        ((CargoFlight) f1).addPkgt(1,2,3);
        cf1.addPkgt(1,2,3);
	System.out.println("ok");
    }
}
