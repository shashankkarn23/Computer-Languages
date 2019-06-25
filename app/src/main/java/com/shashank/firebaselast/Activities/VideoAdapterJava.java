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

public class VideoAdapterJava extends RecyclerView.Adapter<VideoAdapterJava.VideoViewHolderJava>  {

    List<YouTubeVideosJava> youtubeVideosList;

    public VideoAdapterJava(){

    }

    public VideoAdapterJava(List<YouTubeVideosJava> youtubeVideosList){
        this.youtubeVideosList= youtubeVideosList;
    }


    @NonNull
    @Override
    public VideoViewHolderJava onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view_java,parent, false);

        return new VideoViewHolderJava(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolderJava holder, int position) {
        holder.webviewVideoAdapterJava.loadData(youtubeVideosList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideosList.size();
    }



    public static class VideoViewHolderJava extends RecyclerView.ViewHolder{

        WebView webviewVideoAdapterJava;

        public VideoViewHolderJava(View itemView) {
            super(itemView);

            webviewVideoAdapterJava= itemView.findViewById(R.id.webviewJava);
            webviewVideoAdapterJava.getSettings().setJavaScriptEnabled(true);
            webviewVideoAdapterJava.setWebChromeClient( new WebChromeClient(){

            });

        }

    }

}
