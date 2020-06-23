package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class ListOfModules extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_modules);
        // edit button to edit the list of modules
        Button editButton = (Button) findViewById(R.id.editButton);
        editButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent editModules = new Intent(getApplicationContext(), EditModules.class);
                startActivity(editModules);
            }
        });

        // view timetable button to view current timetable
        Button viewTimetableButton = (Button) findViewById(R.id.viewTimetableButton);
        viewTimetableButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent viewTimetable = new Intent(getApplicationContext(), NoTimetable.class);
                startActivity(viewTimetable);
            }
        });

        //generate button to set requirement for new timetable
        Button generateTimetableButton = (Button) findViewById(R.id.generateTimetableButton);
        generateTimetableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent generateNewTimetable = new Intent(getApplicationContext(), SetRequirement.class);
                startActivity(generateNewTimetable);
            }
        });
    }
}

/*
        //ListView listOfModules = (ListView) findViewById(R.id.listView);
        //capture the textview and set the string as its text
        TextView modulesListTextView = (TextView) findViewById(R.id.modulesListTextView);
        //get the intent that started this activity and extract the string
        Intent intentToGetMod = getIntent();
        String module = intentToGetMod.getStringExtra("message");
        modulesListTextView.setText(module);
    }
}
 */
