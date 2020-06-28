package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonNotFoundError extends AppCompatActivity {
    Button refineConditionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_not_found_error);

        refineConditionButton = (Button) findViewById(R.id.refineCondBtn);
        refineConditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regenerateTimetable = new Intent(getApplicationContext(), SetRequirement.class);
                startActivity(regenerateTimetable);
                //directs user back to edit modules class to edit modules, and condition etc
            }
        });
    }
}
