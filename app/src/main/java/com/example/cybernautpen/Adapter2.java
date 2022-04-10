package com.example.cybernautpen;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder>{
    LayoutInflater inflater;
    List<penny2> pennyses;

    public Adapter2(Context ctx, List<penny2> pennyses) {
        this.inflater = LayoutInflater.from(ctx);
        this.pennyses = pennyses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.t1.setText(pennyses.get(position).getSlug());
        holder.t2.setText(pennyses.get(position).getFollowers_no());
        holder.t3.setText(pennyses.get(position).getStatus());
        Picasso.get().load(pennyses.get(position).getCommunityimage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return pennyses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3,t4;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.textView6);
            t2 = itemView.findViewById(R.id.textView7);
            t3 = itemView.findViewById(R.id.textView8);
            image = itemView.findViewById(R.id.imageView2);
        }
    }
}
