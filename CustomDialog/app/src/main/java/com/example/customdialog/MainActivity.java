package com.example.customdialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(v-> {
                    Dialog d = new Dialog(this);
                    d.setContentView(R.layout.dialog);
                    TextView msg = d.findViewById(R.id.msg);
                    Button ok = d.findViewById(R.id.ok);
                    msg.setText("Hello! This is a Custom Dialog.");
                    ok.setOnClickListener(view -> {
                      d.dismiss();
                });
                d.show();
            });
}}