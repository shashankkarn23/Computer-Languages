package com.shashank.firebaselast.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.shashank.firebaselast.R;

import java.util.Vector;

public class JavaVideoActivity extends AppCompatActivity {


    RecyclerView rvJavaActivity;
    Vector<YouTubeVideosJava> youTubeVideosJava= new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_video);


        rvJavaActivity=findViewById(R.id.recyclerViewJava);
        rvJavaActivity.setHasFixedSize(true);
        rvJavaActivity.setLayoutManager(new LinearLayoutManager(this));





        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/grEKMHGYyns\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/WOUpjal8ee4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/9_CJYK47d6M\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/FK4a6XrM2P0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5W568dNIVPM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/9Kk1dGkpGPI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/E-LMhKEwL_w\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/haI01OWwFPk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/n7D5El5-pEU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4NGi9WzLTFg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/VtDBsy_enkE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/n7D5El5-pEU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/neTl7g7dGqI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/PKLvLJcSs8A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/IZJWI0d0zw8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/JzzvQgz3px8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/WkfoBYV_zX4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0-nM4IoQXsY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/JWFWbSH2Q_M\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Dhe1Q_N89EE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/TnJ_bzLfUXk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/rzfiE0UuZnQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/pv1C0_6k78A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/tpP8EQE8DNU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ywYMkaoIvYA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/g5Kphf1exzg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4K0vDFyPa2o\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/zFORKqC4lKA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/eqtzsqMiFss\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/JlRgBWWYOSE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/M2Q052lF55Y\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jp6O9SPf5T0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jvBnoA5sUfA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/EbnofpvSZx4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jrq-XSfrisY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/2kyctZDPeio\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/2-TKmwzxtZ8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0_vyy5oRn-c\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/KkAiNXR42fk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/V7-PnNDPwVk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/lSKrdopNNks\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/CZFr8wR4xlk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xftdnEpZRuA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/oMwU4lTAO8g\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/okHL1h5rhNM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/rYVX-hCAUIo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/cWLUROPLPZc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/vEzd6CfQYnA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/3gWUH_4ExQ8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/NU5Wgj560fs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5pLNsNKWbsk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/6P0YVDMJIyQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4LZc6WtloIc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/6A5SRl1VwbE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/TlFC8tAqD9w\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/vKyyexUlit8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Bz36rTn5WEQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/bn3zKuU6gwI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/V-PQvKUtSY8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/AozJ0CR2W4A\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/YqBVgUh64Ks\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/lrYghXs9EEU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/I0o0olRhLDk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5hMqIdPexVs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/mAoJtlLfrqg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/mjjEPYPCri8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/eEujVn-ZTLE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5nNTafzmX9o\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kP6VKOtpf2M\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-TxHjyC8WY4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/dCvEChffnTA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kHWcA4X2anE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/tt_astMjep0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/-Alpmo-OfJs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/aFZ-0bbSLi8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/361J5nra5PU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/y6qpkSS15hw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/P89hOqvBhCw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/AmdgVatPL9k\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Y49U25-sRo8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/a6cdFZwX7kQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/RAaPv49jkCw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/1ZDApgnufSI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/i710R2JDZ7c\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/WZgcRSWVgpQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/P5DOzTL3O_w\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/AmRjm4Cksmo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/zZq_XDhU-rc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/RcIsb9iFKH8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/TMh91DIR-A0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Ggjxn8Q9VuE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4e_RsZWdiSc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/1MY9VjQrgho\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5J9o2Q7MqUQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/aRxZ4jw5YPk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/HuOuWTeGmEk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/iVbgcByqFic\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/--5rs8QFKOs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Jcd91wP6MV4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/XKEBjp1k8cQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/1PRVeeYG8z8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/to9DPVsdByE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/8WTVLa1Xtsk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/RrKmwLBEv-U\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/F4uv1ks11Co\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/_dm5E-TUm9E\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/gCwOHA7w_UY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/V3X6uV4Xg34\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0N-DhLQ5pxs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/EaNlSWOnOjE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/b2uFL4BFDYg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/WIh-TVq4ifI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/KWbr7B5LDzs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/yFpkdkibvfg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/PeRMCPRpc84\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/w7D5YB2U2jU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/qo9S2CeoqQE\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/V6iY-kan_6E\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0vO0XVN3H-s\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/MN7MgQz0bCI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/L95658yXRgI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Xj1uYKa8rIw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xvXbvrUUGMM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/b3C3ODumC24\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/BeV8eh84tEM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/RH7G-N2pa8M\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/A1tnVMpWHh8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5NOLuoG6fcQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/HhrQqmp3hXI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/QWMyhFUtFHo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0xrhqxTOphI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/c8bghFb_WrA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/W5gnVp1NUNU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/oAp4GYprVHM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/BeR8AcSu-OU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/uu20xO9AaU4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/D42jIaoFM1c\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/7KThZb9G7II\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/okruEgWGVGU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/LyAMUSKBBuo\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/PYMKk4XothI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/jOLH1eLjs84\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/sI4utYmh7O4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/KOAsLaK4Wzw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/ThN8IXr0n_k\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/JV0atjBcUv4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/rWlHQnvrZcw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/5vzCjvUwMXg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/DyTEu08x3o0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/me9CcSXLHHc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/8QOjN89wA-Y\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/55tCJ8Odjvw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/fkqeCvFJs_o\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/A620gzL0XPU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/_GLjsVdAhGw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/8man0ZNx3FU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/mY1IquoLFhg\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/akCAvlyHN2k\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/0yah_nXy94s\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/Hf4nVJjtD8k\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/y97AhsHq0Kw\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/2UbiwEt_rro\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/9Orn0Pwp3YU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/b0On2gN020k\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/kbs3SowJozQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/VjnmgzXMKlM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/pNQaBBqLHuc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/4zvGCilsWL4\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/36rRIQciNSM\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/qQHDS5kXRdY\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/WavMGROrKKs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/hFF-E9swEr8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/nvluJ9yf4ho\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideosJava.add(new YouTubeVideosJava("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/svQKKg3aFzo\" frameborder=\"0\" allowfullscreen></iframe>"));









        VideoAdapterJava vaj= new VideoAdapterJava(youTubeVideosJava);
        rvJavaActivity.setAdapter(vaj);
    }
}
