package com.shashank.firebaselast.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shashank.firebaselast.R;

import java.util.Vector;

public class HtmlVideoActivity extends AppCompatActivity {

    RecyclerView rvHtmlActivity;
    Vector<YouTubeVideosHtml> youTubeVideosHtml= new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_video);

        rvHtmlActivity=findViewById(R.id.recyclerViewHtml);
        rvHtmlActivity.setHasFixedSize(true);
        rvHtmlActivity.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/3MH8P2eFnnk\" frameborder=\"0\" allowfullscreen></iframe>"));

        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/yTHTo28hwTQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/bfqBUDk99Tc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-8IoQTg5Ybs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/KHT6scxGm38\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Pf8xmAZYZC4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/1JFeWDZ-2D8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/P7KU6mqdmJ0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xIFZdFeGgoE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/o1Vqr1MdRmg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/g7js1fW4AZw\" frameborder=\"0\" allowfullscreen></iframe>"));






        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xLDZvePzgK8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/28z80vRCHYo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4A2NP5TdDBg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/bEuTfgwb6lU8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/yb_xJJXUvyg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4qEh8bwDW0I\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/f62FD8t4aPU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4DS4z20ZGyI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jnG3mtEhpRQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/AKMgc4rzTrc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/6Z8I8sOinUo\" frameborder=\"0\" allowfullscreen></iframe>"));



        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/AqAFnB-z8-Q\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/VIgxwR9AVrk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/65QhaSFuxdo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/IgFfsZfkd24\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/tm84gW72KFU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/CilS1-ukeUA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/j4kTLpezHDI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Hr9dv5FCpZw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/zvSR_2v5xj8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/I9dNFHasF_U\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosHtml.add(new YouTubeVideosHtml("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/cUgpPAP0lUM\" frameborder=\"0\" allowfullscreen></iframe>"));



        VideoAdapterHtml vah= new VideoAdapterHtml(youTubeVideosHtml);
        rvHtmlActivity.setAdapter(vah);

    }
}
