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

public class VideoAdapterHtml extends RecyclerView.Adapter<VideoAdapterHtml.VideoViewHolderHtml> {

    List<YouTubeVideosHtml> youtubeVideosList;

    public VideoAdapterHtml(){

    }

    public VideoAdapterHtml(List<YouTubeVideosHtml>youtubeVideosList){
        this.youtubeVideosList= youtubeVideosList;
    }

    @NonNull
    @Override
    public VideoViewHolderHtml onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view_html,parent, false);

        return new VideoViewHolderHtml(view);
    }


    @Override
    public void onBindViewHolder(@NonNull VideoViewHolderHtml holder, int position) {
        holder.webviewVideoAdapterHtml.loadData(youtubeVideosList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideosList.size();
    }

    public static class VideoViewHolderHtml extends RecyclerView.ViewHolder{

        WebView webviewVideoAdapterHtml;

        public VideoViewHolderHtml(View itemView) {
            super(itemView);

            webviewVideoAdapterHtml= itemView.findViewById(R.id.webviewHtml);
            webviewVideoAdapterHtml.getSettings().setJavaScriptEnabled(true);
            webviewVideoAdapterHtml.setWebChromeClient( new WebChromeClient(){

            });

        }

    }


}
