package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.widget.AdapterView;
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
    public Button plusButton;
    //public EditText removeModulesEditText;
    //public Button deleteButton;

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
        plusButton = (Button) findViewById(R.id.plusButton);
        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(EditModules.this, android.R.layout.simple_list_item_multiple_choice, listOfUserInput);
        View.OnClickListener addListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getModuleInput = addModulesEditText.getText().toString();
                if (listOfUserInput.contains(getModuleInput)) {
                    Toast.makeText(getBaseContext(), "Module already added", Toast.LENGTH_LONG).show();
                } else if (getModuleInput == null || getModuleInput.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "Input field is Empty", Toast.LENGTH_LONG).show();
                } else {
                    listOfUserInput.add(getModuleInput);
                    addModulesEditText.setText("");
                    //convert the items in listview to view items
                    adapter1.notifyDataSetChanged();
                }
            }
        };

        //remove modules
        listOfModules.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                SparseBooleanArray positionChecker = listOfModules.getCheckedItemPositions();
                int count = listOfModules.getCount();
                for (int i = count - 1; i>=0; i--) {
                    if (positionChecker.get(i)) {
                        adapter1.remove(listOfUserInput.get(i));
                        Toast.makeText(getBaseContext(), "Module removed", Toast.LENGTH_SHORT).show();
                    }
                }

                positionChecker.clear();
                adapter1.notifyDataSetChanged();;

                return false;
            }
        });

        listOfModules.setLongClickable(true);
        plusButton.setOnClickListener(addListener);
        listOfModules.setAdapter(adapter1);
    }
}

        /*
        listOfModules.setAdapter(adapter1);
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
                                                  ((EditText) findViewById(R.id.addModulesEditText)).setText(" ");
                                                  //convert the items in listview to view items
                                                  adapter1.notifyDataSetChanged();
                                              }
                                          }
                                      });

         */


        //delete button to remove modules
        /*
        removeModulesEditText = (EditText) findViewById(R.id.removeModEditText);
        deleteButton = (Button) findViewById(R.id.removeModsBtn);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moduleToBeRemoved = removeModulesEditText.getText().toString();
                //remove this module from the current list
                listOfUserInput.remove(moduleToBeRemoved);
                //method notifies the attached observers that the underlying
                //data has been changed and any View reflecting the data set should refresh itself
                adapter1.notifyDataSetChanged();
                //((EditText) findViewById(R.id.removeModEditText)).setText(" ");
                }
            });

        //Intent intentToDisplayMod = new Intent(getApplicationContext(), ListOfModules.class);
        //intentToDisplayMod.putExtra("message", module);
        //startActivity(intentToDisplayMod);
*/




