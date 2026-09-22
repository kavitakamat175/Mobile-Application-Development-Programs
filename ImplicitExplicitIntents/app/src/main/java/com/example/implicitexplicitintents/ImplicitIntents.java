package com.example.implicitexplicitintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImplicitIntents extends AppCompatActivity {
ListView lv;
EditText et;
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
        lv=findViewById(R.id.listview);
        et=findViewById(R.id.etNum);
        ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this,R.array.arrintents, android.R.layout.simple_expandable_list_item_1);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String choice=adapterView.getItemAtPosition(i).toString();
                String mobile;
                switch (choice)
                {
                    case "Dial a number":
                        Intent intent1=new Intent(Intent.ACTION_DIAL);
                        mobile=et.getText().toString();
                        intent1.setData(Uri.parse("tel:"+mobile));
                        startActivity(intent1);
                        break;
                    case "Send SMS":
                        Intent intent2=new Intent(Intent.ACTION_SENDTO);
                        mobile =et.getText().toString();
                        intent2.putExtra("sms_body","Hello How are you");
                        intent2.setData(Uri.parse("smsto:"+mobile));
                        startActivity(intent2);
                        break;
                    case "Google Search":
                        Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                        startActivity(intent3);
                        break;
                    case "Show Google Map":
                        Intent intent4=new Intent(Intent.ACTION_VIEW);
                        intent4.setData(Uri.parse("geo:18.6311,73.7842"));
                        startActivity(intent4);
                        break;

                }

            }
        });

        sp=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> arrayAdapter2=ArrayAdapter.createFromResource(this,R.array.arrintents, android.R.layout.simple_expandable_list_item_1);
        sp.setAdapter(arrayAdapter2);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(ImplicitIntents.this, "You selected "+ choice, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }
}