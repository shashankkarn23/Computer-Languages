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

public class VideoAdapterCPP extends RecyclerView.Adapter<VideoAdapterCPP.VideoViewHolderCPP> {

    List<YouTubeVideosCPP> youtubeVideosList;

    public VideoAdapterCPP(){

    }

    public VideoAdapterCPP(List<YouTubeVideosCPP>youtubeVideosList){
        this.youtubeVideosList= youtubeVideosList;
    }


    @NonNull
    @Override
    public VideoViewHolderCPP onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view_cpp,parent, false);

        return new VideoViewHolderCPP(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapterCPP.VideoViewHolderCPP holder, int position) {
        holder.webviewVideoAdapterCPP.loadData(youtubeVideosList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
       return youtubeVideosList.size();
    }

    public static class VideoViewHolderCPP extends RecyclerView.ViewHolder{

        WebView webviewVideoAdapterCPP;

        public VideoViewHolderCPP(View itemView) {
            super(itemView);

            webviewVideoAdapterCPP= itemView.findViewById(R.id.webviewCPP);
            webviewVideoAdapterCPP.getSettings().setJavaScriptEnabled(true);
            webviewVideoAdapterCPP.setWebChromeClient( new WebChromeClient(){

            });

        }

    }


}
