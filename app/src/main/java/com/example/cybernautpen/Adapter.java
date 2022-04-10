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

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    LayoutInflater inflater;
    List<penny> pennys;

    public Adapter(Context ctx, List<penny> pennys) {
        this.inflater = LayoutInflater.from(ctx);
        this.pennys = pennys;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.t1.setText(pennys.get(position).getId());
        holder.t2.setText(pennys.get(position).getCommunityname());
        holder.t3.setText(pennys.get(position).getCreated_date());
        holder.t4.setText(pennys.get(position).getCommunitycategory());
        Picasso.get().load(pennys.get(position).getCommunityimage()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return pennys.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3,t4;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.textView);
            t2 = itemView.findViewById(R.id.textView2);
            t3 = itemView.findViewById(R.id.textView3);
            t4 = itemView.findViewById(R.id.textView4);
            image = itemView.findViewById(R.id.imageView);
        }
    }
}
