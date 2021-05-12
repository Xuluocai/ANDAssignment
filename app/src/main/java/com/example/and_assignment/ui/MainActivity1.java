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
            if (viewModel.getDeparture().equals("beijing")&&viewModel.getArrival().equals("shanghai")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result.class));

            }else if (viewModel.getDeparture().equals("copenhagen")&&viewModel.getArrival().equals("shanghai"))
            {
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result1.class));

            }else if (viewModel.getDeparture().equals("shanghai")&&viewModel.getArrival().equals("beijing")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result2.class));
                finish();
            }else if (viewModel.getDeparture().equals("shanghai")&&viewModel.getArrival().equals("copenhagen")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result3.class));
                finish();
            } else if (viewModel.getDeparture().equals("copenhagen")&&viewModel.getArrival().equals("beijing")){
                    Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(this,Result4.class));
                    finish();
            }else if (viewModel.getDeparture().equals("zurich")&&viewModel.getArrival().equals("copenhagen")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result5.class));
                finish();
            }else if (viewModel.getDeparture().equals("copenhagen")&&viewModel.getArrival().equals("zurich")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result6.class));
                finish();
            }else if (viewModel.getDeparture().equals("beijing")&&viewModel.getArrival().equals("copenhagen")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result7.class));
                finish();
            }else if (viewModel.getDeparture().equals("copenhagen")&&viewModel.getArrival().equals("madrid")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result8.class));
                finish();
            }else if (viewModel.getDeparture().equals("madrid")&&viewModel.getArrival().equals("copenhagen")){
                Toast.makeText(this,"Searching....",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Result9.class));
                finish();
            }

        else if(viewModel.getDeparture().isEmpty()||viewModel.getArrival().isEmpty()){
            Toast.makeText(this,"Please enter the departure or arrival",Toast.LENGTH_SHORT).show();
        }else
            {
            Toast.makeText(this,"Unknown departure or arrival",Toast.LENGTH_SHORT).show();
        }
    }

}