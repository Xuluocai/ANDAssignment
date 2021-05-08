package com.example.and_assignment.data;

public class Flight {
    private String flightNumber;
    private String departure;
    private String arrival;
    private String seat;
    private String status;
    private String book;

    public Flight(String flightNumber, String departure, String arrival, String seat, String status,String book){
        this.arrival=arrival;
        this.departure=departure;
        this.flightNumber=flightNumber;
        this.seat=seat;
        this.status=status;
        this.book=book;
    }

    public Flight(String departure, String arrival){
        this.departure=departure;
        this.arrival=arrival;
    }

    public Flight(){

    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getSeat() {
        return seat;
    }

    public String getStatus() {
        return status;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    public void setBook(String book){this.book=book;}
    public String getBook(){return book;}



}
