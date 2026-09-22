package com.example.menusdemo;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.etName);
        registerForContextMenu(et);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
        }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.cut)
            Toast.makeText(this, "cut option is selected", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.copy)
            Toast.makeText(this, "Copy option is selected", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.paste)
            Toast.makeText(this, "Paste option is selected", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.selectAll)
            Toast.makeText(this, "SelectAll option is selected", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.bold)
            Toast.makeText(this, "bold option is selected", Toast.LENGTH_SHORT).show();

        return true;
    }
}