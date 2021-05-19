package com.example.and_assignment;

import android.app.Application;

import com.example.and_assignment.data.UserLiveData;
import com.example.and_assignment.data.UserRepository;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRepositoryTest {
    private final UserLiveData currentUser=new UserLiveData();
    private final Application app=new Application();
    private UserRepository userRepository=UserRepository.getInstance(app);
    @Test
    public void getCurrentUser() {
assertEquals(currentUser.getValue(),userRepository.getCurrentUser().getValue());
    }
}
