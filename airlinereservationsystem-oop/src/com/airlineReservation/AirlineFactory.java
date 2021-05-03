package com.airlineReservation;

public class AirlineFactory {
    private String airlineName;
    protected AirlineSeatType seatTypes;

    public AirlineFactory(){}

    public AirlineFactory(String airlineName){
        this.airlineName = airlineName;
    }

    public int getSeatCapacity() {
        return 15;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getUserSeatType() {
        return seatTypes.getSeatType();
    }

}
