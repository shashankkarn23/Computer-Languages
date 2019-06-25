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

public class JavaPdfActivity extends AppCompatActivity {

    private String x = "";
    public void setVariable(String S){
        this.x = S;
    }
    public String getVaribale(){
        return x;
    }
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    DownloadManager downloadManagerJAVA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_pdf);
        btn1= findViewById(R.id.JAVATopic1);
        btn2= findViewById(R.id.JAVATopic2);
        btn3= findViewById(R.id.JAVATopic3);
        btn4= findViewById(R.id.JAVATopic4);
        btn5= findViewById(R.id.JAVATopic5);
        btn6= findViewById(R.id.JAVATopic6);
        btn7= findViewById(R.id.JAVATopic7);
        btn8= findViewById(R.id.JAVATopic8);
        btn9= findViewById(R.id.JAVATopic9);
        btn10= findViewById(R.id.JAVATopic10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("31");
                Intent intent1= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent1.putExtra("Key","31");
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("32");
                Intent intent2= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent2.putExtra("Key","32");
                startActivity(intent2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("33");
                Intent intent3= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent3.putExtra("Key","33");
                startActivity(intent3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("34");
                Intent intent4= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent4.putExtra("Key","34");
                startActivity(intent4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("35");
                Intent intent5= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent5.putExtra("Key","35");
                startActivity(intent5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("36");
                Intent intent6= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent6.putExtra("Key","36");
                startActivity(intent6);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("37");
                Intent intent7= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent7.putExtra("Key","37");
                startActivity(intent7);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("38");
                Intent intent8= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent8.putExtra("Key","38");
                startActivity(intent8);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("39");
                Intent intent9= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent9.putExtra("Key","39");
                startActivity(intent9);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("40");
                Intent intent10= new Intent(JavaPdfActivity.this,PdfcActivity.class);
                intent10.putExtra("Key","40");
                startActivity(intent10);

            }
        });

    }
}
