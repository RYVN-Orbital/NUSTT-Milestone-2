package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EditModules extends AppCompatActivity {
    public static ArrayList<String> listOfUserInput = new ArrayList<String>();
    public EditText addModulesEditText;
    public static ListView listOfModules;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_modules);
        //close edit button to stop editing modules
        Button closeEditButton = (Button) findViewById(R.id.closeEditButton);
        closeEditButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent closeEditModules = new Intent(getApplicationContext(), ListOfModules.class);
                startActivity(closeEditModules);
            }
        });

        addModulesEditText = (EditText) findViewById(R.id.addModulesEditText);
        listOfModules = (ListView) findViewById(R.id.listOfModulesTV);
        //plus button to add modules
        Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getModuleInput = addModulesEditText.getText().toString();

                if (listOfUserInput.contains(getModuleInput)) {
                    Toast.makeText(getBaseContext(), "Module already added", Toast.LENGTH_LONG).show();
                } else if (getModuleInput == null || getModuleInput.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "Input field is Empty", Toast.LENGTH_LONG).show();
                } else {
                    listOfUserInput.add(getModuleInput);
                    //ArrayAdapter<String> adapter = new ArrayAdapter<String> (EditModules.this, android.R.layout.simple_list_item_1, listOfUserInput);
                    //convert the items in listview to view items
                    //listOfModules.setAdapter(adapter);
                    ((EditText) findViewById(R.id.addModulesEditText)).setText(" ");
                }
            }
        });

        //Intent intentToDisplayMod = new Intent(getApplicationContext(), ListOfModules.class);
        //intentToDisplayMod.putExtra("message", module);
        //startActivity(intentToDisplayMod);



    }
}




