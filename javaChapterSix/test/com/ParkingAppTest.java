package com;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ParkingAppTest {
        @Test
    void testForHoursCustomerParked(){
        ParkingApp space = new ParkingApp();
        space.setHoursParked(Integer.parseInt(JOptionPane.showInputDialog("Enter the hours parked")));
        assertEquals(5, space.getHoursParked());
    }

    @Test
    void testThatHoursParkedIsGreaterThanMinimumParkHours(){
        ParkingApp space = new ParkingApp();
        space.setHoursParked(Integer.parseInt(JOptionPane.showInputDialog("Enter the hours parked")));
        assertEquals(2,space.getRemainingParkHours());
    }

    @Test
    void testToCalculateChargesForMinimumParkHours(){
        ParkingApp space = new ParkingApp();
        space.setHoursParked(Integer.parseInt(JOptionPane.showInputDialog("Enter the hours parked")));
        assertEquals(6.00, space.getChargesForMinimumParkHours());
    }

    @Test
    void testToCalculateChargesForExtraHours(){
        ParkingApp space = new ParkingApp();
        space.setHoursParked(Integer.parseInt(JOptionPane.showInputDialog("Enter the hours parked")));
        space.getRemainingParkHours();
        space.setChargesForExtraParkHours();
        assertEquals(1.5, space.getChargesForExtraParkHours());
    }

    @Test
    void testToCalculateChargesForCustomer(){
        ParkingApp space = new ParkingApp();
        space.setHoursParked(Integer.parseInt(JOptionPane.showInputDialog("Enter the hours parked")));
        assertEquals(7.5, space.calculateCharges());
    }

}