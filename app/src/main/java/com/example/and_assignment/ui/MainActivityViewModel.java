package com.example.and_assignment.ui;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.and_assignment.data.UserRepository;
import com.google.firebase.auth.FirebaseUser;

public class MainActivityViewModel extends AndroidViewModel {
    private final UserRepository userRepository;
    public MainActivityViewModel(Application app){
        super(app);
        userRepository = UserRepository.getInstance(app);

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
}
