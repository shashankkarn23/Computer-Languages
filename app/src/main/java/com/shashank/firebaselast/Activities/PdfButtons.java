package com.shashank.firebaselast.Activities;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;
import com.shashank.firebaselast.R;

public class PdfButtons extends AppCompatActivity {

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
        setContentView(R.layout.activity_pdf_buttons);

        btn1= findViewById(R.id.Topic1);
        btn2= findViewById(R.id.Topic2);
        btn3= findViewById(R.id.Topic3);
        btn4= findViewById(R.id.Topic4);
        btn5= findViewById(R.id.Topic5);
        btn6= findViewById(R.id.Topic6);
        btn7= findViewById(R.id.Topic7);
        btn8= findViewById(R.id.Topic8);
        btn9= findViewById(R.id.Topic9);
        btn10= findViewById(R.id.Topic10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("1");
                Intent intent1= new Intent(PdfButtons.this,PdfcActivity.class);
                intent1.putExtra("Key","1");
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("2");
                Intent intent2= new Intent(PdfButtons.this,PdfcActivity.class);
                intent2.putExtra("Key","2");
                startActivity(intent2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("3");
                Intent intent3= new Intent(PdfButtons.this,PdfcActivity.class);
                intent3.putExtra("Key","3");
                startActivity(intent3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("4");
                Intent intent4= new Intent(PdfButtons.this,PdfcActivity.class);
                intent4.putExtra("Key","4");
                startActivity(intent4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("5");
                Intent intent5= new Intent(PdfButtons.this,PdfcActivity.class);
                intent5.putExtra("Key","5");
                startActivity(intent5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("6");
                Intent intent6= new Intent(PdfButtons.this,PdfcActivity.class);
                intent6.putExtra("Key","6");
                startActivity(intent6);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("7");
                Intent intent7= new Intent(PdfButtons.this,PdfcActivity.class);
                intent7.putExtra("Key","7");
                startActivity(intent7);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("8");
                Intent intent8= new Intent(PdfButtons.this,PdfcActivity.class);
                intent8.putExtra("Key","8");
                startActivity(intent8);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("9");
                Intent intent9= new Intent(PdfButtons.this,PdfcActivity.class);
                intent9.putExtra("Key","9");
                startActivity(intent9);

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVariable("10");
                Intent intent10= new Intent(PdfButtons.this,PdfcActivity.class);
                intent10.putExtra("Key","10");
                startActivity(intent10);

            }
        });
    }
}
