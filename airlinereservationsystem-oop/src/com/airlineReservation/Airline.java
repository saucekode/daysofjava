package com.airlineReservation;

public class Airline extends AirlineFactory{
    public Airline(String airlineName){
        super(airlineName);
        seatTypes = new AirlineSeatType();
    }
}
