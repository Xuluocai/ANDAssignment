package com.example.and_assignment.ui;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.and_assignment.data.Flight;
import com.example.and_assignment.data.UserRepository;
import com.google.firebase.auth.FirebaseUser;

public class MainActivityViewModel extends AndroidViewModel {
    private final UserRepository userRepository;
    private Flight flight;
    public MainActivityViewModel(Application app){
        super(app);
        userRepository = UserRepository.getInstance(app);
        flight=new Flight();

    }
    public void init() {
        String userId = userRepository.getCurrentUser().getValue().getUid();

    }
    public LiveData<FirebaseUser> getCurrentUser(){
        return userRepository.getCurrentUser();
    }

    public void signOut() {
        userRepository.signOut();
    }

    public void setDeparture(String departure){
        flight.setDeparture(departure);
    }
    public void setArrival(String arrival){
        flight.setArrival(arrival);
    }

    public String getDeparture(){
        return flight.getDeparture();
    }

    public String getArrival(){
        return flight.getArrival();
    }


}
