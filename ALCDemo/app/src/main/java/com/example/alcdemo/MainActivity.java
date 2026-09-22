package com.example.alcdemo;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private final String TAG="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreate method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause method Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onPause method called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onStart method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onRestart method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onResume method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onStop method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Called", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onDestroy method called");
    }
}