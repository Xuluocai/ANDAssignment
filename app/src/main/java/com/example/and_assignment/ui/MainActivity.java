package com.example.and_assignment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.and_assignment.R;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel viewModel;
    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        super.onCreate(savedInstanceState);

        viewModel.init();
        checkIfSignedIn();
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editTextTextPersonName);
        editText2=findViewById(R.id.editTextTextPersonName2);
    }

    private void checkIfSignedIn() {
        viewModel.getCurrentUser().observe(this, user -> {
            if (user != null) {
                String message = "Welcome " + user.getDisplayName();

            } else
                startLoginActivity();
        });
    }

    private void startLoginActivity() {
        startActivity(new Intent(this, SigninActivity.class));
        finish();
    }


    public void signOut(View v) {
        viewModel.signOut();
    }

    public void Rearch(View view) {
        startActivity(new Intent(this,Result.class));
        finish();
    }

}