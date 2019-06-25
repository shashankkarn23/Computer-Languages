package com.shashank.firebaselast.Activities;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shashank.firebaselast.R;

public class CPPdfActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
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
        setContentView(R.layout.activity_cppdf);

        btn1= findViewById(R.id.CPPTopic1);
        btn2= findViewById(R.id.CPPTopic2);
        btn3= findViewById(R.id.CPPTopic3);
        btn4= findViewById(R.id.CPPTopic4);
        btn5= findViewById(R.id.CPPTopic5);
        btn6= findViewById(R.id.CPPTopic6);
        btn7= findViewById(R.id.CPPTopic7);
        btn8= findViewById(R.id.CPPTopic8);
        btn9= findViewById(R.id.CPPTopic9);
        btn10= findViewById(R.id.CPPTopic10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("11");
                Intent intent1= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent1.putExtra("Key","11");
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("12");
                Intent intent2= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent2.putExtra("Key","12");
                startActivity(intent2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("13");
                Intent intent3= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent3.putExtra("Key","13");
                startActivity(intent3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("14");
                Intent intent4= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent4.putExtra("Key","14");
                startActivity(intent4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("15");
                Intent intent5= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent5.putExtra("Key","15");
                startActivity(intent5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("16");
                Intent intent6= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent6.putExtra("Key","16");
                startActivity(intent6);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("17");
                Intent intent7= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent7.putExtra("Key","17");
                startActivity(intent7);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("18");
                Intent intent8= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent8.putExtra("Key","18");
                startActivity(intent8);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("19");
                Intent intent9= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent9.putExtra("Key","19");
                startActivity(intent9);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("20");
                Intent intent10= new Intent(CPPdfActivity.this,PdfcActivity.class);
                intent10.putExtra("Key","20");
                startActivity(intent10);

            }
        });
    }
}
