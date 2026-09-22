package com.example.implicitexplicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.etUN);
        et2=findViewById(R.id.etPWD);
        b1=findViewById(R.id.btnCall);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String UN=et1.getText().toString();
             String PWD=et2.getText().toString();
             Intent intent=new Intent(MainActivity.this,CalledActivity.class);
             intent.putExtra("username",UN);
             intent.putExtra("password",PWD);
             //startActivity(intent);
                startActivityForResult(intent,2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==3)
        {

           String msg=data.getStringExtra("result");
            Toast.makeText(this, "Welcome Back "+msg, Toast.LENGTH_SHORT).show();
        }

    }
}