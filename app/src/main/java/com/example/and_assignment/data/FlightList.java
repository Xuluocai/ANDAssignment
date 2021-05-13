package com.example.and_assignment.data;

import com.example.and_assignment.R;

import java.util.ArrayList;

public class FlightList {
    private ArrayList<Flight> flights=new ArrayList<>();

    public FlightList(){

        flights.add(new Flight("KN5737", "beijing", "shanghai", "Good", "On time", "http://www.flycua.com/","Boeing-737", R.drawable.zlh));
        flights.add(new Flight("HO1254","beijing","shanghai","Bad","Delay","http://www.juneyaoair.com/","A321",R.drawable.jx));
        flights.add(new Flight("HU7605","beijing","shanghai","Comfortable","Cancel","http://www.hainanairlines.com","Boeing-787",R.drawable.hn));
        flights.add(new Flight("HU7613","beijing","shanghai","Good","Cancel","http://www.hainanairlines.com","Boeing-738",R.drawable.hn));
        flights.add(new Flight("KN5978","shanghai","beijing","Good","On time","http://www.flycua.com/","Boeing-737",R.drawable.zlh));
        flights.add(new Flight("CZ8882","shanghai","beijing","Good","On time","https://global.csair.com/","A330",R.drawable.nh));
        flights.add(new Flight("HO1253", "shanghai", "beijing", "Bad", "On time", "http://www.juneyaoair.com/","A320",R.drawable.jx));
        flights.add(new Flight("CA878","copenhagen","beijing","Comfortable","Delay","http://www.airchina.com","A350-900",R.drawable.ca));
        flights.add(new Flight("CA877","beijing","copenhagen","Comfortable","Cancel","http://www.airchina.com","A350-900",R.drawable.ca));
        flights.add(new Flight("SK997","copenhagen","shanghai","Comfortable","Cancel","http://www.sas.com","A350-900",R.drawable.sas));
        flights.add(new Flight("SK998","shanghai","copenhagen","Comfortable","On time","http://www.sas.com","A350-900",R.drawable.sas));
        flights.add(new Flight("IB3059","copenhagen","madrid","Bad","On time","http://www.iberia.com","A320",R.drawable.xby));
        flights.add(new Flight("IB3058", "madrid", "copenhagen", "Bad", "On time", "http://www.iberia.com","A320",R.drawable.xby));
        flights.add(new Flight("LX1267","copenhagen","zurich","Bad","Delay","http://www.swiss.com","223",R.drawable.rs));
        flights.add(new Flight("LX1272","zurich","copenhagen","Bad","Cancel","http://www.swiss.com","223",R.drawable.rs));
        flights.add(new Flight("SK0601","copenhagen","zurich","Bad","Cancel","http://www.sas.com","CR9",R.drawable.sas));
        flights.add(new Flight("SK0602","zurich","copenhagen","Bad","On time","http://www.sas.com","CR9",R.drawable.sas));


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
