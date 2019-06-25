package com.shashank.firebaselast.Activities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.shashank.firebaselast.R;

import java.util.List;
import java.util.Vector;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<CollegeElearningYouTubeVideos> youtubeVideosList;

    public VideoAdapter(Vector<CollegeElearningActivity> youTubeVideos){

    }

    public VideoAdapter(List<CollegeElearningYouTubeVideos> youtubeVideosList){
        this.youtubeVideosList=youtubeVideosList;
    }
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view_college_elearning,parent, false);

        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.VideoViewHolder holder, int position) {

        holder.webviewVideoAdapter.loadData(youtubeVideosList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() { return youtubeVideosList.size(); }

    public static class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView webviewVideoAdapter;

        public VideoViewHolder(View itemView) {
            super(itemView);

            webviewVideoAdapter= itemView.findViewById(R.id.collegeelearningwebview1);
            webviewVideoAdapter.getSettings().setJavaScriptEnabled(true);
            webviewVideoAdapter.setWebChromeClient( new WebChromeClient(){

            });

        }

    }
}
