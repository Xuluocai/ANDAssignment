package com.example.and_assignment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and_assignment.R;
import com.example.and_assignment.data.Adapter;
import com.example.and_assignment.data.Flight;
import com.example.and_assignment.data.FlightList;

import java.util.ArrayList;

public class Result extends AppCompatActivity {
    private ResultViewModel viewModel;
  private RecyclerView recyclerView;
  private RecyclerView.Adapter adapter;
  private RecyclerView.LayoutManager layoutManager;
  private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(ResultViewModel.class);
        viewModel.init();
        checkIfSignedIn();

        setContentView(R.layout.activity_result);
        textView=findViewById(R.id.book);
        ArrayList<Flight> flightArrayList=new ArrayList<>();
        FlightList flightList=new FlightList();
        for (int i=0;i<flightList.getSize();i++){
            if (flightList.getFlightByNum(i).getDeparture().equals("beijing")&&flightList.getFlightByNum(i).getArrival().equals("shanghai")){
                flightArrayList.add(flightList.getFlightByNum(i));
            }
        }

        recyclerView=findViewById(R.id.FlightsRecView);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        adapter=new Adapter(flightArrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

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

    public void signOut(View view) {viewModel.signOut();
    }


    public void back(View view) {
        startActivity(new Intent(this, MainActivity1.class));
    }




public void web(View view) {
        textView.setText(textView.getText().toString());
        textView.setAutoLinkMask(Linkify.ALL);

    }


}