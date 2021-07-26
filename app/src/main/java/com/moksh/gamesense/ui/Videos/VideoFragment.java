package com.moksh.gamesense.ui.Videos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.moksh.gamesense.R;

import static com.moksh.gamesense.SplashActivity.videoModelClasses;


public class VideoFragment extends Fragment {

    RecyclerView videoRecycler;
    VideoAdapter videoAdapter;
    public VideoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_video,container,false);
        videoRecycler = root.findViewById(R.id.video_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        videoRecycler.setLayoutManager(linearLayoutManager);
        videoAdapter = new VideoAdapter(getContext(),videoModelClasses);

        videoRecycler.setAdapter(videoAdapter);
        videoAdapter.notifyDataSetChanged();

        return root;
    }
}