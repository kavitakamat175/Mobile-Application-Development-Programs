package com.example.otherviewsdemo;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TextDemos extends AppCompatActivity {
    TextView tv;
    Button btn;
Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_demos);
        tv = findViewById(R.id.tvMsg);
        btn=findViewById(R.id.btndisplay);
//        Intent intent=getIntent();
//        String un=intent.getStringExtra("un");
//        String p=intent.getStringExtra("pwd");
//        Bundle bundle=intent.getExtras();
//        String un1=bundle.getString("un");
//        String p1=bundle.getString("pwd");
//        tv.setText(un + " " + p);
//        Toast.makeText(this, " "+ un1 + " " + p1, Toast.LENGTH_SHORT).show();

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(TextDemos.this,MainActivity.class);
        intent.putExtra("message","success");
        setResult(3,intent);
        finish();
    }
});


    }
}