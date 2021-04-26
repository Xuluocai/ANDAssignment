package com.example.and_assignment.data;

import retrofit2.Retrofit;
public class ServiceGenerator {
    private static FlightApi flightApi;

    public static FlightApi getFlightApi(){
        if(flightApi==null){
            flightApi=new Retrofit.Builder()
                    .baseUrl()
                    .addConverterFactory()
                    .build()
                    .creat(FlightApi.class);
        }return flightApi;
    }
}
