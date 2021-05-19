package com.example.and_assignment;

import com.example.and_assignment.data.Flight;
import com.example.and_assignment.data.FlightList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightListTest {
    private FlightList flightList=new FlightList();

    @Test
    public void getFlightByDeparture(){
        Flight flight=new Flight("KN5737", "beijing", "shanghai", "Good", "On time", "http://www.flycua.com/","Boeing-737", R.drawable.zlh);
        assertEquals(flightList.getFlightByDeparture("beijing").getFlightNumber(),flight.getFlightNumber());
    }
@Test
    public void getFlightByNum(){
   Flight flight= new Flight("KN5737", "beijing", "shanghai", "Good", "On time", "http://www.flycua.com/","Boeing-737", R.drawable.zlh);
        assertEquals(flightList.getFlightByNum(0).getFlightNumber(),flight.getFlightNumber());
    }
@Test
    public void addFlight(){
        Flight flight=new Flight("KN5737","1","2","Comfortable","Cancel","http://www.hainanairlines.com","Boeing-787",R.drawable.hn);
        flightList.addFlight(flight);
        assertEquals(flight.getFlightNumber(),flightList.getFlightByDeparture("1").getFlightNumber());
    }
@Test
    public void getFlightByArrival(){
    Flight flight=new Flight("KN5737", "beijing", "shanghai", "Good", "On time", "http://www.flycua.com/","Boeing-737", R.drawable.zlh);
    assertEquals(flightList.getFlightByArrival("shanghai").getFlightNumber(),flight.getFlightNumber());
    }
    @Test
    public void getSize(){
        assertEquals(17,flightList.getSize());
    }
}
