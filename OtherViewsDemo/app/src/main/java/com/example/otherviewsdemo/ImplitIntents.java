package com.example.otherviewsdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImplitIntents extends AppCompatActivity {
ListView listView;
EditText etTel,etSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implit_intents);
        listView=findViewById(R.id.lv);
        etTel=findViewById(R.id.etPh);
        etSMS=findViewById(R.id.etsms);
        ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this, R.array.intents, android.R.layout.simple_expandable_list_item_1);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String choice=adapterView.getItemAtPosition(i).toString();
                String data=etTel.getText().toString();

                switch (choice)
                {
                    case "Dial a number":
                        Intent intent=new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+data));
                        startActivity(intent);
                        break;
                    case "Send SMS":
                        Intent intent1=new Intent(Intent.ACTION_SENDTO);
                        String sms=etSMS.getText().toString();
                        intent1.setData(Uri.parse("smsto:"+ data));
                        intent1.putExtra("sms_body",sms);
                        startActivity(intent1);
                        break;
                    case "Set Alarm":

                        break;
                    case "Visit Google Home Page":
                        Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
                        startActivity(intent3);

                        break;
                    case "Show Google Map":
                        Intent intent4=new Intent(Intent.ACTION_VIEW);
                        intent4.setData(Uri.parse("geo:18.6366,73.8052"));
                        startActivity(intent4);
                        break;
                    default:
                        Toast.makeText(ImplitIntents.this, "Select a choice", Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}