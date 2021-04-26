package com.example.and_assignment.data;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FlightApi {
    @GET("flightNumber")
    Call<FlightResponse> getFlight(@Path("flightNumber")String flightNumber);
}
