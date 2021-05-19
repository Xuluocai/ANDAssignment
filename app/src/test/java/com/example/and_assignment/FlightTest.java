package com.example.and_assignment;

import com.example.and_assignment.data.Flight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight =new Flight("SK595","copenhagen","KEF","Good","Ontime","www.sas.com","B737",R.drawable.sas);

    @Test
    public void getImageResource(){
        assertEquals(flight.getImageResource(),R.drawable.sas);
    }
    @Test
    public void getFlightNumber(){
        assertEquals(flight.getFlightNumber(),"SK595");
    }
@Test
    public void getArrival() {

    assertEquals(flight.getArrival(),"KEF");
    }
@Test
    public void getDeparture() {

    assertEquals(flight.getDeparture(),"copenhagen");
    }
@Test
    public void getSeat() {

    assertEquals(flight.getSeat(),"Good");
    }
@Test
    public void getStatus() {
        assertEquals(flight.getStatus(),"Ontime");
    }
@Test
    public void setArrival() {
        flight.setArrival("PEK");
        assertEquals("PEK",flight.getArrival());

    }
@Test
    public void setDeparture() {
       flight.setDeparture("AAU");
       assertEquals("AAU",flight.getDeparture());
    }
@Test
    public void setFlightNumber() {

        flight.setFlightNumber("SK596");
        assertEquals("SK596",flight.getFlightNumber());
    }
@Test
    public void setSeat() {
        flight.setSeat("Bad");
        assertEquals("Bad",flight.getSeat());

    }
    @Test
    public void setBook(){flight.setBook("www.ca.com");
    assertEquals("www.ca.com",flight.getBook());}
    @Test
    public void getBook(){
        assertEquals("www.sas.com",flight.getBook());
    }
@Test
    public void getPlane() {
        assertEquals("B737",flight.getPlane());

    }
}
