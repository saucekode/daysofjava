package com.airlineReservation;

public enum SeatTypes {
    FIRST, BUSINESS, ECONOMY;

    public String toString(){
        return switch(this){
            case FIRST -> "First";
            case BUSINESS -> "Business";
            case ECONOMY -> "Economy";
        };
    }
}
