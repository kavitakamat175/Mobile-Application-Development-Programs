package com.example.flcdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart called");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy called");

    }

    public void callFragment(View view) {
        FirstFragment firstFragment = new FirstFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.frameLayout,firstFragment,null)
                .commit();

    }
}