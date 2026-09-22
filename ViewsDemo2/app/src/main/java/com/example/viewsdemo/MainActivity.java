package com.example.viewsdemo;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Handler;
import java.util.logging.LogRecord;



public class MainActivity extends AppCompatActivity {
RadioGroup radioGroup;
AutoCompleteTextView autoCompleteTextView;
ProgressBar pb;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        radioGroup=findViewById(R.id.rgGender);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(@NonNull RadioGroup radioGroup, int i) {
//                RadioButton rb=findViewById(i);
//                Toast.makeText(MainActivity.this, "you selected " + rb.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });

        webView=findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

      //  webView.loadUrl("https://www.google.com/");
//        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
//        String [] citites={"Pune","Patna","Mumbai"};
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,citites);
//        autoCompleteTextView.setAdapter(arrayAdapter);
//        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//String city=adapterView.getItemAtPosition(i).toString();
//                Toast.makeText(MainActivity.this, "You selected " + city, Toast.LENGTH_SHORT).show();
//            }
//        });
//

        pb=findViewById(R.id.progressbar);
        pb.setProgress(0);
        Runnable runnable = new Runnable() {
            int progress = 0;
            @Override
            public void run() {
                progress = progress + 10;
                pb.setProgress(progress);
                if (progress < 100) {
                    pb.postDelayed(this, 1000);
                }
            }
        };
        pb.post(runnable);
    }
}