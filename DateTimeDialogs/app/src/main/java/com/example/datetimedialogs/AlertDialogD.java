package com.example.datetimedialogs;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlertDialogD extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_d);
        btn=findViewById(R.id.btnCallAlert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialogD.this);
                builder.setTitle("This is my Alert Dialog Box")
                        .setMessage("Phone memory is full, needs some files to delete")
                        .setIcon(R.drawable.ic_launcher_background)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogD.this, "Files will be deleted", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertDialogD.this, "Files will not be deleted", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertDialogD.this, "No action", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alertDialog=builder.create();
                alertDialog.show();



            }
        });


    }
}