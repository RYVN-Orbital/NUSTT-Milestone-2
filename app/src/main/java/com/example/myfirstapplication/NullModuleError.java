package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NullModuleError extends AppCompatActivity {
    Button refineModulesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_module_error);

        refineModulesButton = (Button) findViewById(R.id.refineModsBtn);
        refineModulesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regenerateTimetable = new Intent(getApplicationContext(), EditModules.class);
                startActivity(regenerateTimetable);
                //directs user back to edit modules class to edit modules, and condition etc
            }
        });
    }
}

