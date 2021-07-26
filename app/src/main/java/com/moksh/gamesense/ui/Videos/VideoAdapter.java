package com.moksh.gamesense.ui.Videos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.moksh.gamesense.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder>{
    Context context;
    ArrayList<VideoModelClass> videoModelClasses = new ArrayList<>();
    public VideoAdapter(Context context, ArrayList<VideoModelClass> videoModelClasses) {
        this.context = context;
        this.videoModelClasses = videoModelClasses;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.video_adapter,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        holder.videoUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoModelClasses.get(videoModelClasses.size()-1-position).getUrl()));
                context.startActivity(intent);
            }
        });
        String videoUrl = videoModelClasses.get(videoModelClasses.size()-1-position).getUrl();
        String subVideoUrl = videoUrl.substring(17);
        String imageUrl = "https://img.youtube.com/vi/"+subVideoUrl+"/0.jpg";
        Glide.with(context)
                .load(imageUrl)
                .centerCrop()
                .into(holder.videoThumbnail);
        holder.videoTitle.setText(videoModelClasses.get(videoModelClasses.size()-1-position).getTitle());

    }

    @Override
    public int getItemCount() {
        return videoModelClasses.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        LinearLayout videoUrl;
        ImageView videoThumbnail;
        TextView videoTitle;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            videoUrl = itemView.findViewById(R.id.video_url);
            videoThumbnail = itemView.findViewById(R.id.video_thumbnail);
            videoTitle = itemView.findViewById(R.id.video_title);
        }
    }
}
