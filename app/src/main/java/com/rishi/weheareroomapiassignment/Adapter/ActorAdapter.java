package com.rishi.weheareroomapiassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rishi.weheareroomapiassignment.Modal.Actor;
import com.rishi.weheareroomapiassignment.R;

import java.util.List;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    private Context context;
    private List<Actor> actorList;

    public ActorAdapter(Context context, List<Actor> actorList) {
        this.context =  context;
        this.actorList = actorList;
    }

    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ActorViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.each_roe,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ActorViewHolder holder, int position) {
        Actor actor=actorList.get(position);
        holder.api.setText("API "+actor.getAPI());
        holder.description.setText("Description "+actor.getDescription());
        holder.link.setText("Link "+actor.getLink());


    }

    public void getAllActors(List<Actor> actorList)
    {
        this.actorList=actorList;
    }

    @Override
    public int getItemCount() {
        return actorList.size();
    }

    public static class ActorViewHolder extends RecyclerView.ViewHolder{
        public TextView api,description,link;


        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);
            api=itemView.findViewById(R.id.api);
            description=itemView.findViewById(R.id.description);
            link=itemView.findViewById(R.id.link);
        }
    }
}
