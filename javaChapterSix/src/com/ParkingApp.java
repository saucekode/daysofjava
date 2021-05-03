package com;

public class ParkingApp {
    private int hoursParked;
    private double remainingHours;
    private static final int MINIMUM_PARKHOURS = 3;
    private static final double MINIMUM_PARKFEE = 2.00;
    private static final double EXTRA_PARKFEE = 0.50;

    public void setHoursParked(int hoursParked){
        this.hoursParked = hoursParked;
    }

    public int getHoursParked(){
        return hoursParked;
    }

    private void checkRemainingParkHours() {
        if(hoursParked > MINIMUM_PARKHOURS){
            remainingHours = hoursParked - MINIMUM_PARKHOURS;
        }else{
            hoursParked *= MINIMUM_PARKFEE;
        }
        this.remainingHours = remainingHours;
    }

    public double getRemainingParkHours(){
        checkRemainingParkHours();
        return remainingHours;
    }

    public void setChargesForExtraParkHours(){
        remainingHours *= EXTRA_PARKFEE;
    }

    public double getChargesForMinimumParkHours(){
        return hoursParked;
    }

    public double getChargesForExtraParkHours(){
        return remainingHours;
    }

    public double calculateCharges(){
        getRemainingParkHours();
        setChargesForExtraParkHours();
        return getChargesForMinimumParkHours() + getChargesForExtraParkHours();
    }
}
