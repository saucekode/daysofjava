package com.airlineReservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirlineFactoryTest {
    AirlineFactory factory;
    AirlineFactory airline;

    @BeforeEach
    void setUp() {
        factory = new AirlineFactory("Arik");
        airline = new Airline("Arik");
    }

    @AfterEach
    void tearDown() {
        factory = null;
        airline = null;
    }

    @Test
    void testThatAirlineSeatCapacityIsAlwaysFifteenSeats(){
        assertEquals(15, factory.getSeatCapacity());
    }

    @Test
    void testThatNewAirlineCanBeCreated(){
        factory.setAirlineName("Arik");
        assertEquals("Arik", factory.getAirlineName());
    }

    @Test
    void testThatAirlineSystemHasSeatTypes(){
        airline.seatTypes.inputSeatType(1);
        assertEquals("First class", airline.getUserSeatType());

        airline.seatTypes.inputSeatType(3);
        assertEquals("Economy class", airline.getUserSeatType());
    }

    @Test
    void testThatAirlineSystemThrowsErrorIfSeatTypeDoesNotExist(){
        try{
            airline.seatTypes.inputSeatType(5);
            assertEquals("Seat type does not exist", airline.getUserSeatType());
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void testThatUserCanInputSeatNumber(){
        airline.seatTypes.inputSeatNumber(4);
        assertEquals(4, airline.seatTypes.getSeatNumber());
    }

    @Test
    void testThatAirlineSystemSeatNumberExistsInSeatType(){
        airline.seatTypes.inputSeatType(1);
        airline.seatTypes.inputSeatNumber(5);
        assertTrue(airline.seatTypes.matches(airline.seatTypes.getSeatNumber()));
    }

}