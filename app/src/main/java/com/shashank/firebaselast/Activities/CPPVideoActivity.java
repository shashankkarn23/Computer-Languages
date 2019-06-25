package com.shashank.firebaselast.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shashank.firebaselast.R;

import java.util.Vector;

public class CPPVideoActivity extends AppCompatActivity {

    RecyclerView rvCPPActivity;
    Vector<YouTubeVideosCPP> youTubeVideosCPP= new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cppvideo);

        rvCPPActivity=findViewById(R.id.recyclerViewCPP);
        rvCPPActivity.setHasFixedSize(true);
        rvCPPActivity.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/mUQZ1qmKlLY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/SQHREey_Yuc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/brqRL_t0RmM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ZTu0kf-7h08\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/MDJ9uEHDhfU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/e840YAaK620\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/z600MQdQ9lg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5kjOhtniLOs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/c7foOFAYqbk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/lW_ZT_OZD1A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/uT0c5X1kvq4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/RKNgEgm_DP8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/fy4hJWctkNc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kwkZpSc6g7Q\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/rPyn7kGHZzA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/oMrt_87aW-U\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/HLv2gVg6Xtc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-QVc_fGSJAw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kcd2FAxC5Ms\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/IqKweotABQI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/dNmdkIu0qww\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/odTejLbwbnc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/TpcT_zNJSHM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4bgabzer4OE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/WqukJuBnLQU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/QHk_hg5NOU4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/TGwl3tJYFRg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kMdoS47ySjs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/S6WkTenfEHk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/VYEhDnQ-2mE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/AqV9_7c9X7s\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/fct0IDKZ5X8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jNfSTNrGItM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/g8sJ4W7oufU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kzDqaBgyVEE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/mnaD9bH6y6A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xWItyeMpagE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/LcHTSDm82pY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/SVggWRRzPRE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/9t3-f3nWpuQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jH2b6bKgrhs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/6gg9Xlv35-I\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/lVRtKPvgvTs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/MaTv85P2nnQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/EUx9pyGuf-4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/QXPh65KtDPw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/I08cFxKY8x8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/gVGnOsB1n_o\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/8XAQzcJvOHk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/frQ1uTnh6Io\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/d83JFFr8CRs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/2yR8dcKT-Ck\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/3-v_RigflHs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/bmTn2mkfxuE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/wQEByoBQG-o\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xnh7ip5gpzc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/qnCRKjPTnHM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/BsYvWqDihGU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/59fy7la7yEI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/6QHkXmLhY-g\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/CyTSm0sUgi4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0Gcy49Gin_k\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/bk11sI0KoWk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Egm6DIiHTC4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ZvWUHWvueQk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-WRllQLW8RE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/FErlySnTBWc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/zsqhrxlp-Fo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/nW0hf2-jaIM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/XRlo8aOUvyU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/q8EUCNAsn6E\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ClUQXuwxyH8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/reWA2RBdFAw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/USHIgMBJ190\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/fCK7sLu0G0Y\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/JZwBW0nYzsk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/7ucLWfWzqg8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/k3hrXKksbVM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/E9Dn-Y4VIQE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosCPP.add(new YouTubeVideosCPP("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/uVsoUyDO8Ow\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapterCPP vac= new VideoAdapterCPP(youTubeVideosCPP);
        rvCPPActivity.setAdapter(vac);

    }
}
