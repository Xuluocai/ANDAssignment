package com.example.and_assignment.data;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        public TextView seat;
        public TextView status;
        public TextView book;
        public TextView plane;
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            departure=itemView.findViewById(R.id.flights_departure);
            arrival=itemView.findViewById(R.id.flights_arrival);
            flightNum=itemView.findViewById(R.id.flights_flightnum);
            seat=itemView.findViewById(R.id.flights_seat);
            status=itemView.findViewById(R.id.flights_status);
            plane=itemView.findViewById(R.id.flights_plane);
            imageView=itemView.findViewById(R.id.imageView);

            book=itemView.findViewById(R.id.book);
            book.setText(Html.fromHtml(book.getText().toString()));
            book.setMovementMethod(LinkMovementMethod.getInstance());
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
holder.imageView.setImageResource(flight.getImageResource());
   holder.departure.setText(flight.getDeparture());
   holder.arrival.setText(flight.getArrival());
   holder.flightNum.setText(flight.getFlightNumber());
   holder.book.setText(flight.getBook());
   holder.seat.setText(flight.getSeat());
   holder.status.setText(flight.getStatus());
   holder.plane.setText(flight.getPlane());


    }

    @Override
    public int getItemCount() {
        return flights.size();
    }
}
