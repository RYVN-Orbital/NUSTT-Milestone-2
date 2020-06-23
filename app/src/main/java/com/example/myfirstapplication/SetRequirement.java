package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Runnable;

public class SetRequirement extends AppCompatActivity {
    //public static Timetable confirmedTT;
    //generatettbutton will kick start the thread
    Button generateTTButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_requirement);

        Spinner criteriaSpinner = (Spinner) findViewById(R.id.criteriaSpinner);
        ArrayAdapter<String> criteriaAdapter = new ArrayAdapter<String>(SetRequirement.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.criteria));

        criteriaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        criteriaSpinner.setAdapter(criteriaAdapter);

        //generateTTButton will direct us to view timetable class and generate timetable
        generateTTButton = (Button) findViewById(R.id.generateButton);

        generateTTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent createTimetable = new Intent(getApplicationContext(), ViewTimetable.class);
                startActivity(createTimetable);
            }
        });
    }
}




