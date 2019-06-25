package com.shashank.firebaselast.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shashank.firebaselast.R;

import java.util.Vector;

public class CollegeElearningActivity extends AppCompatActivity {
    RecyclerView rvCollegeElearningActivity;
    Vector<CollegeElearningYouTubeVideos> youTubeVideos= new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_elearning);

        rvCollegeElearningActivity=findViewById(R.id.collegeelearningrecyclerview);
        rvCollegeElearningActivity.setHasFixedSize(true);
        rvCollegeElearningActivity.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/wEdvGqxafq8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/u-kH-5JJSgU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/cC9I3XxkZXw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ed2lnJNf7HU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/2NWeucMKrLI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/3DeLiClDd04\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/iWx3yyFMWQA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/oSpmApiUsHw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/oX2FpFYXE38\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/To7WA4ijQQ0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/k1ur8rX-DQQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/LEHaSSYreeo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/7F-Q2oVBYKk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/1EeetMPACMI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/hSHFjPvqFjw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/T3sj5iTK_0M\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/rubhV7Bu34E\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/cgkGwRonMU4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/_oqmPcqWHlE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ohVRskLlHqM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/PXwWoL0IG5A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/FtZ1YgSFqs0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/KgVzRmUPsdo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/DZ0ZXipUx-A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/PO3BibcbkK8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/brC8O7AeCFA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/pze0PKwdfl0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/nNSn1uVNyiU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/7pAXm7WEA2I\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/eU6no0EEJM0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/FPjLbPu5BsQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Y17-tKQXrxs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/JKVc02-GmGs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4XaaIGBdhaw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/qZRP5hKGHrs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/IJp4KU7SiuQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/PVTDEOeSP88\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-SSsm0gVu3o\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/yvpCxgV3AZo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/XxwGqFaxJK0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/VcEHkVStszM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/QCe2ks9b8YI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/IPYA3b3_nyk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/_LDN79j5H5s\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/6qiNJWw5aLI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5BpYD7TxvKU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/vjq-13YADeI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/sq6n8dL117c\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-9fqo94G6YU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Y7R8m-10GJc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Buq071iqYAM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/gWppLYaCICM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/VMFKz7Klx7I\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/38I_AUMpKpQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/8nIilb2kiSU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Hxhbp1WSDJA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/yPYrxbkY2rk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/lv5IDF7dmBk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/sAj_Jrqrg5g\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/_oyuKw3vBf8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ye2tvFir65g\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/wAmq8eIkdI8\" frameborder=\"0\" allowfullscreen></iframe>"));




        VideoAdapter videoAdapter= new VideoAdapter(youTubeVideos);
        rvCollegeElearningActivity.setAdapter(videoAdapter);
    }
}
