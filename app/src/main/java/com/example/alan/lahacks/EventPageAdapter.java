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
public class EventPageAdapter extends RecyclerView.Adapter<EventPageAdapter.EventViewHolder> {

    private Context mCtx;
    private List<Comment> commList;

    public EventPageAdapter(List<Comment> commList, Context mCtx) {
        this.mCtx = mCtx;
        this.commList = commList;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.event_page_comm, null);
        EventViewHolder holder = new EventViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {

        Comment comm = commList.get(position);
        holder.commentName.setText(comm.getName());
        holder.commenText.setText(comm.getComm());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(comm.getImage()));


    }

    @Override
    public int getItemCount() {
        return commList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView commentName, commenText;

        public EventViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.commentImg);
            commentName = itemView.findViewById(R.id.commentName);
            commenText = itemView.findViewById(R.id.commenText);
        }
    }
}