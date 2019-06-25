package com.shashank.firebaselast.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shashank.firebaselast.R;

public class VideoTutorial extends AppCompatActivity {



    Button  Cprogramming,CPlusPlus,Java,Html;
    private String x = "";
    public void setVariable(String S){
        this.x = S;
    }
    public String getVaribale(){
        return x;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tutorial);

        Cprogramming= findViewById(R.id.CButton);
        CPlusPlus=findViewById(R.id.CPlusPlusTutorial);
        Java= findViewById(R.id.JavaTutorial);
        Html=findViewById(R.id.HtmlTutorial);

        Cprogramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("1");
                Intent CProgrammingActivity= new Intent(VideoTutorial.this,AfterLogin.class);
                CProgrammingActivity.putExtra("Key","1");
                startActivity(CProgrammingActivity);
            }
        });
        CPlusPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("2");
                Intent CProgrammingActiv= new Intent(VideoTutorial.this,AfterLogin.class);
                CProgrammingActiv.putExtra("Key","2");
                startActivity(CProgrammingActiv);
            }
        });
        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("3");
                Intent CProgrammingActiv= new Intent(VideoTutorial.this,AfterLogin.class);
                CProgrammingActiv.putExtra("Key","3");
                startActivity(CProgrammingActiv);
            }
        });
        Html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("4");
                Intent CProgrammingActiv= new Intent(VideoTutorial.this,AfterLogin.class);
                CProgrammingActiv.putExtra("Key","4");
                startActivity(CProgrammingActiv);

            }
        });

    }
}
