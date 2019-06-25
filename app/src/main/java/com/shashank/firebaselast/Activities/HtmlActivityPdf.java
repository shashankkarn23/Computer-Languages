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

public class HtmlActivityPdf extends AppCompatActivity {


    private String x = "";
    public void setVariable(String S){
        this.x = S;
    }
    public String getVaribale(){
        return x;
    }
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_pdf);

        btn1= findViewById(R.id.HtmlTopic1);
        btn2= findViewById(R.id.HtmlTopic2);
        btn3= findViewById(R.id.HtmlTopic3);
        btn4= findViewById(R.id.HtmlTopic4);
        btn5= findViewById(R.id.HtmlTopic5);
        btn6= findViewById(R.id.HtmlTopic6);
        btn7= findViewById(R.id.HtmlTopic7);
        btn8= findViewById(R.id.HtmlTopic8);
        btn9= findViewById(R.id.HtmlTopic9);
        btn10= findViewById(R.id.HtmlTopic10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("21");
                Intent intent1= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent1.putExtra("Key","21");
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("22");
                Intent intent2= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent2.putExtra("Key","22");
                startActivity(intent2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("23");
                Intent intent3= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent3.putExtra("Key","23");
                startActivity(intent3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("24");
                Intent intent4= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent4.putExtra("Key","24");
                startActivity(intent4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("25");
                Intent intent5= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent5.putExtra("Key","25");
                startActivity(intent5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("26");
                Intent intent6= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent6.putExtra("Key","26");
                startActivity(intent6);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("27");
                Intent intent7= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent7.putExtra("Key","27");
                startActivity(intent7);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("28");
                Intent intent8= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent8.putExtra("Key","28");
                startActivity(intent8);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("29");
                Intent intent9= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent9.putExtra("Key","29");
                startActivity(intent9);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("30");
                Intent intent10= new Intent(HtmlActivityPdf.this,PdfcActivity.class);
                intent10.putExtra("Key","30");
                startActivity(intent10);

            }
        });
    }
}
