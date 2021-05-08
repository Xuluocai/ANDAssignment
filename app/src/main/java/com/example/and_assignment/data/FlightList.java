package com.example.and_assignment.data;

import java.util.ArrayList;

public class FlightList {
    private ArrayList<Flight> flights=new ArrayList<>();

    public FlightList(){

        final boolean add = flights.add(new Flight("SK998", "beijing", "shanghai", "Seat is comfortable", "On time", "http://www.airchina.com"));
        flights.add(new Flight("CA998","beijing","shanghai","Seat is comfortable","Delay","http://www.airchina.com"));
        flights.add(new Flight("SK595","cph","kef","Bad","Cancel","http://www.sas.com"));
        flights.add(new Flight("SK596","beijing","shanghai","Bad","Cancel","http://www.sas.com"));
        flights.add(new Flight("CA919","nanjing","beijing","good","On time","http://www.airchina.com"));
    }

    public Flight getFlightByDeparture(String departure){
        for (int i=0;i<flights.size();i++){
            flights.get(i).getDeparture().equals(departure);
            return flights.get(i);
        }
        return null;
    }

    public Flight getFlightByNum(int n){
        return flights.get(n);
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public Flight getFlightByArrival(String arrival){
        for (int i=0;i<flights.size();i++){
            flights.get(i).getArrival().equals(arrival);
            return flights.get(i);
        }
        return null;
    }
    public int getSize(){
        return flights.size();
    }
}
