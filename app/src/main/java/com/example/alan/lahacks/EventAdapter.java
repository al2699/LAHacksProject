package com.example.alan.lahacks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * RecyclerView.Adapter - sends/binds the data to the ViewHolder
 * RecyclerView.ViewHolder - Holds the view
 */
public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    private Context mCtx;
    private List<EventData> eventList;

    public EventAdapter(Context mCtx, List<EventData> eventList) {
        this.mCtx = mCtx;
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        EventViewHolder holder = new EventViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {

        EventData event = eventList.get(position);
        holder.textViewTitle.setText(event.getTitle());
        holder.textViewDesc.setText(event.getShortDesc());
        holder.textViewDate.setText(event.getDate());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(event.getImage()));


    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewDate, textViewRating, textViewPrice;

        public EventViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageViewProfile);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewDate = itemView.findViewById(R.id.textViewDate);
        }
    }
}
