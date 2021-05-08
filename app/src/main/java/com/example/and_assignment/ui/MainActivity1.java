package com.example.and_assignment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.and_assignment.R;
import com.example.and_assignment.data.FlightList;

public class MainActivity1 extends AppCompatActivity {
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

    public void Research(View view) {
        viewModel.setDeparture(editText1.getText().toString());
        viewModel.setArrival(editText2.getText().toString());
        FlightList flightList=new FlightList();
        if (flightList.getFlightByArrival(viewModel.getArrival()).getDeparture().equals(viewModel.getDeparture()))
        {
            if (viewModel.getDeparture().equals("beijing")&&viewModel.getArrival().equals("shanghai")){
                startActivity(new Intent(this,Result.class));
             finish();
            }else if (viewModel.getDeparture().equals("cph")&&viewModel.getArrival().equals("kef")){
                startActivity(new Intent(this,Result1.class));
               finish();
            }
        }
        else if(viewModel.getDeparture().isEmpty()||viewModel.getArrival().isEmpty()){
            Toast.makeText(this,"Please enter the departure or arrival",Toast.LENGTH_SHORT).show();
        }else
            {
            Toast.makeText(this,"Unknown departure or arrival",Toast.LENGTH_SHORT).show();
        }
    }

}