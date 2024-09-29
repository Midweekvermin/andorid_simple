package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView texty;
    EditText edited;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        texty = findViewById(R.id.texty);
        texty.setText(R.string.changed);
        edited = findViewById(R.id.edity);
        Button btn = findViewById(R.id.btn);




            }

    public void clicky(View v) {

        String inputname = edited.getText().toString();
        //Toast is a brief message at the bottom of the screen
        Toast.makeText(MainActivity.this, "Hello " + inputname,
                Toast.LENGTH_SHORT).show();
        Button b = (Button) v; // casts the view to a button
        b.setText(inputname);
        texty.setText("Your name is " + inputname);

        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}