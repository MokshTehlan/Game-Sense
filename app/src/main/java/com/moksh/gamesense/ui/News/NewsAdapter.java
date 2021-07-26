package com.moksh.gamesense.ui.News;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.moksh.gamesense.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;



public class NewsAdapter extends  RecyclerView.Adapter<NewsAdapter.MyViewHolder>{

    @NonNull
    @NotNull
    ArrayList<ModelClass> modelClasses = new ArrayList<>();
    Context context;

    public NewsAdapter(@NonNull ArrayList<ModelClass> modelClasses, Context context) {
        this.modelClasses = modelClasses;
        this.context = context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.news_adapter,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {

        holder.headline.setText(modelClasses.get(modelClasses.size()-position-1).getHeadline());
        Glide.with(context)
                .load(modelClasses.get(modelClasses.size()-position-1).getImage())
                .centerCrop()
                .into(holder.image);
        holder.url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(modelClasses.get(modelClasses.size()-1-position).getUrl()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView headline;
        LinearLayout url;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.news_image);
            headline = itemView.findViewById(R.id.headline);
            url = itemView.findViewById(R.id.news_card);
        }
    }
}