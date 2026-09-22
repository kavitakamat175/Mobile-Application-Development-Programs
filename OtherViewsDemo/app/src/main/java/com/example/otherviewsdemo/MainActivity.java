package com.example.otherviewsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
EditText etUN,etPWD;
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUN=findViewById(R.id.etName);
        etPWD=findViewById(R.id.etPwd);
        btn=findViewById(R.id.btnCall);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TextDemos.class);
                String nm=etUN.getText().toString();
                String pwd=etPWD.getText().toString();
                intent.putExtra("un",nm);
                intent.putExtra("pwd",pwd);
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
            String msg=data.getStringExtra("message");
            Toast.makeText(this, " " +msg, Toast.LENGTH_SHORT).show();
        }
    }
}