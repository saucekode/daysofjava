package com.airlineReservation;

import java.util.Arrays;

public interface AirlineUtility {

    void inputSeatType(int seatType);
    String getSeatType();
}

class AirlineSeatType implements AirlineUtility{
    private SeatTypes seatTypes;
    private int seatType;
    private final int[][] seatCapacity = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15} };
    private int[] seats;
    private int seatNumber;

    public void setSeatType(SeatTypes seatTypes) {
        this.seatTypes = seatTypes;
    }

    public void inputSeatType(int seatType) {
        switch(seatType){
            case 1 -> setSeatType(SeatTypes.FIRST);
            case 2 -> setSeatType(SeatTypes.BUSINESS);
            case 3 -> setSeatType(SeatTypes.ECONOMY);
            default -> throw new IllegalArgumentException("Seat type does not exist");
        }
        this.seatType = seatType;
    }

    public String getSeatType() {
        return seatTypes + " class";
    }

    private int[] seats(){
        int[] availableSeats = new int[0];
        switch(seatType){
            case 1 -> availableSeats = seatCapacity[0];
            case 2 -> availableSeats = seatCapacity[1];
            case 3 -> availableSeats = seatCapacity[2];
        }
        return availableSeats;
    }

    public StringBuilder viewSeatCapacity() {
        StringBuilder allSeats = new StringBuilder();
        seats = seats();
        for (int seat : seats) {
            allSeats.append(seat).append(" ");
        }
        return allSeats;
    }

    public void inputSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean matches(int seatNumber) {
        boolean seatExists = false;
        seats = seats();
        for(int seat : seats){
            seatExists = Arrays.asList(seat).contains(seatNumber);
            if(seatExists){
                seatExists = seatExists;
                break;
            };
        }
        return seatExists;

    }
}
