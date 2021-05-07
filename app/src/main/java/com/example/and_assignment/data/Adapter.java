package com.example.and_assignment.data;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and_assignment.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Flight> flights;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView departure;
        public TextView arrival;
        public TextView flightNum;
        public TextView book;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            departure=itemView.findViewById(R.id.flights_departure);
            arrival=itemView.findViewById(R.id.flights_arrival);
            flightNum=itemView.findViewById(R.id.flights_flightnum);
            book=itemView.findViewById(R.id.book);
        }
    }
    public Adapter(ArrayList<Flight> flights){
        this.flights=flights;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.flights_item,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
   Flight flight=flights.get(position);

   holder.departure.setText(flight.getDeparture());
   holder.arrival.setText(flight.getArrival());
   holder.flightNum.setText(flight.getFlightNumber());
    }

    @Override
    public int getItemCount() {
        return flights.size();
    }
}
