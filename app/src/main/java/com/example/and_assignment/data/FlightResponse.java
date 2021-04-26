package com.example.and_assignment.data;

public class FlightResponse {
    private String flightNumber;
    private String departure;
    private String arrival;
    private String seat;
    private Status status;

    public Flight getFlight(){
        return new Flight(flightNumber,departure,arrival,seat,status);
    }
}
