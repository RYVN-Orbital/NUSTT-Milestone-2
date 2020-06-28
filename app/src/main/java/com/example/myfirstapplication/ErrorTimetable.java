package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ErrorTimetable extends AppCompatActivity {
    Button refineCriteriaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_timetable);

        refineCriteriaButton = (Button) findViewById(R.id.refineButton);
        refineCriteriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regenerateTimetable = new Intent(getApplicationContext(), EditModules.class);
                startActivity(regenerateTimetable);
                //directs user back to edit modules class to edit modules, and condition etc
            }
        });
    }
}
