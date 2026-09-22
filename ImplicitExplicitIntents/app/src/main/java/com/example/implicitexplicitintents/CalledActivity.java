package com.example.implicitexplicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalledActivity extends AppCompatActivity {
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_called);
        btn=findViewById(R.id.btnBack);
        Intent intent = getIntent();
        String un = intent.getStringExtra("username");
        String pwd = intent.getStringExtra("PWD");
        if (un.equals("scott") && pwd.equals("tiger"))
            Toast.makeText(this, "Welcome " + un, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Sorry " + un, Toast.LENGTH_LONG).show();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(CalledActivity.this, MainActivity.class);
                intent1.putExtra("result", "Success");
                setResult(3,intent1);
                finish();

            }
        });
    }


}