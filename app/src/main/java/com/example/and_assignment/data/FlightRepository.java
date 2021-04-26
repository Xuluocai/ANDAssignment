package com.example.and_assignment.data;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class FlightRepository {
    private static FlightRepository instance;
    private final MutableLiveData<Flight> flightMutableLiveData;

    private FlightRepository(){
        flightMutableLiveData=new MutableLiveData<>();
    }

    public static synchronized FlightRepository getInstance(){
        if(instance==null)
            instance=new FlightRepository();
        return instance;
    }

    public LiveData<Flight> getFlight(){
        return flightMutableLiveData;
    }

public void setFlight(String flghtNumber){
        FlightApi flightApi=ServiceGenerator.getFlightApi();
        Call<FlightResponse> call =flightApi.getFlight(flghtNumber);
    call.enqueue(new Callback<FlightResponse>() {
        @EverythingIsNonNull
        @Override
        public void onResponse(Call<FlightResponse> call, Response<FlightResponse> response) {
            if(response.isSuccessful())
                flightMutableLiveData.setValue(response.body().getFlight());
        }

        @EverythingIsNonNull
            @Override
            public void onFailure(Call<FlightResponse> call,Throwable t){
                Log.i("Retrofit","Something went wrong");
            }
        });
}
}
