package com.shashank.firebaselast.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.shashank.firebaselast.R;


public class AfterLogin extends AppCompatActivity {
    Button pdfBtn1,videoBtn1,pdfBtn2,videoBtn2,pdfBtn3,videoBtn3,
            pdfBtn4,videoBtn4;
    VideoTutorial v = new VideoTutorial();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        pdfBtn1= findViewById(R.id.pdfButton1);
        videoBtn1= findViewById(R.id.videoTutorial1);
        pdfBtn2 = findViewById(R.id.pdfButton2);
        videoBtn2 = findViewById(R.id.videoTutorial2);
        pdfBtn3 = findViewById(R.id.pdfButton3);
        videoBtn3 = findViewById(R.id.videoTutorial3);
        pdfBtn4 = findViewById(R.id.pdfButton4);
        videoBtn4 = findViewById(R.id.videoTutorial4);

        if(getIntent().getStringExtra("Key").equals("1")) {
            pdfBtn2.setVisibility(View.GONE);
            videoBtn2.setVisibility(View.GONE);
            pdfBtn3.setVisibility(View.GONE);
            videoBtn3.setVisibility(View.GONE);
            pdfBtn4.setVisibility(View.GONE);
            videoBtn4.setVisibility(View.GONE);
        }

        if(getIntent().getStringExtra("Key").equals("2")) {
            pdfBtn1.setVisibility(View.GONE);
            videoBtn1.setVisibility(View.GONE);
            pdfBtn3.setVisibility(View.GONE);
            videoBtn3.setVisibility(View.GONE);
            pdfBtn4.setVisibility(View.GONE);
            videoBtn4.setVisibility(View.GONE);
        }

        if(getIntent().getStringExtra("Key").equals("3")) {
            pdfBtn1.setVisibility(View.GONE);
            videoBtn1.setVisibility(View.GONE);
            pdfBtn2.setVisibility(View.GONE);
            videoBtn2.setVisibility(View.GONE);
            pdfBtn4.setVisibility(View.GONE);
            videoBtn4.setVisibility(View.GONE);
        }

        if(getIntent().getStringExtra("Key").equals("4")) {
            pdfBtn1.setVisibility(View.GONE);
            videoBtn1.setVisibility(View.GONE);
            pdfBtn2.setVisibility(View.GONE);
            videoBtn2.setVisibility(View.GONE);
            pdfBtn3.setVisibility(View.GONE);
            videoBtn3.setVisibility(View.GONE);
        }


        pdfBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent intent1= new Intent(AfterLogin.this,PdfButtons.class);
                        startActivity(intent1);
            }
        });
        videoBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5= new Intent(AfterLogin.this,CollegeElearningActivity.class);
                startActivity(intent5);
            }
        });

        pdfBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(AfterLogin.this,CPPdfActivity.class);
                startActivity(intent2);
        }
        });
        videoBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6= new Intent(AfterLogin.this,CPPVideoActivity.class);
                startActivity(intent6);
            }
        });

        pdfBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(AfterLogin.this,JavaPdfActivity.class);
                startActivity(intent3);
            }
        });
        videoBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(AfterLogin.this,JavaVideoActivity.class);
                startActivity(intent3);
            }
        });

        pdfBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4= new Intent(AfterLogin.this,HtmlActivityPdf.class);
                startActivity(intent4);
            }
        });
        videoBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(AfterLogin.this,HtmlVideoActivity.class);
                startActivity(intent3);
            }
        });

    }
}
