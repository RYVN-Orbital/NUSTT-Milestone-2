package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;
import java.lang.Runnable;
import java.util.Set;

public class ViewTimetable extends AppCompatActivity {
    public static Timetable confirmedTT;
    public TextView timetableTextView;
    public Button viewButton;
    private Handler mainHandler = new Handler();
    public Button infoButton;
    public Button editConditionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_timetable);
        viewButton = (Button) findViewById(R.id.viewButton);
        timetableTextView = (TextView) findViewById(R.id.timetableTextView);

        //info about the tt
        infoButton = (Button) findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent getInfoIntent = new Intent(getApplicationContext(), TimetableInfo.class);
                startActivity(getInfoIntent);
            }
        });

        //edit condition
        editConditionButton = (Button) findViewById(R.id.editCondBtn);
        editConditionButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent editCondIntent = new Intent(getApplicationContext(), SetRequirement.class);
                startActivity(editCondIntent);
            }
        });

        //edit modules
        
    }


    //background thread of generating the timetable
    public void startThread(View view) {
        generateTimetableRunnable runnable = new generateTimetableRunnable();
        new Thread(runnable).start();
    }

    //background runnable of generating the timetable
    class generateTimetableRunnable implements Runnable {

        @Override
        public void run() {
            int numberOfModules = EditModules.listOfUserInput.size();

            //get information from the prev activity
            String conditionLessonModuleCode = SetRequirement.modEditText.getText().toString();
            String conditionLessonNum = SetRequirement.lessonCodeEditText.getText().toString();
            String conditionLessonType = SetRequirement.typeSpinner.getSelectedItem().toString();

            Module[] modulesTaking = new Module[numberOfModules];
            List<AllLesson> listOfLectures = new ArrayList<>();
            List<AllLesson> listOfLabs = new ArrayList<>();
            List<AllLesson> listOfSectionals = new ArrayList<>();
            List<AllLesson> listOfRecitations = new ArrayList<>();
            List<AllLesson> listOfTutorials = new ArrayList<>();
            boolean hasError = false;
            Data data = new Data();

            //EDIT: shifted the creation of tt to here to add in the lesson in the condition
            Timetable tt = new Timetable(1);

            for (int i = 0; i < numberOfModules; ++i) {
                String newModuleCode = EditModules.listOfUserInput.get(i);
                Module newModule = data.get(newModuleCode);

                if (newModule == null) {
                    hasError = true;
                    //System.out.println("Null Module Error");
                    //cant find module
                    Intent errorTT = new Intent(getApplicationContext(), NullModuleError.class);
                    startActivity(errorTT);
                    break;
                } else {
                    modulesTaking[i] = newModule;

                    /*New 1*/
                    if (newModule.getCode().equals(conditionLessonModuleCode)) {
                        List<Lesson> conditionLesson = newModule.getLesson(conditionLessonNum, conditionLessonType);
                        if (conditionLesson.isEmpty()) {
                            hasError = true;
                            //System.out.println("Error");
                            //cant find lesson
                            Intent errorTT = new Intent(getApplicationContext(), LessonNotFoundError.class);
                            startActivity(errorTT);
                            break;
                        } else {
                            for (Lesson lesson : conditionLesson) {
                                if (tt.check(lesson)) {
                                    tt.add(lesson);
                                } else {
                                    hasError = true;
                                    //System.out.println("Error");
                                    //if the lesson cant be added to the tt
                                    Intent errorTT = new Intent(getApplicationContext(), ErrorTimetable.class);
                                    startActivity(errorTT);
                                    break;
                                }
                            }
                            //Empty the All" " list in the module
                            boolean updateBoolean = newModule.updateAllLesson(conditionLessonType);
                            if (! updateBoolean) {
                                hasError = true;
                                System.out.println("Update Error");
                            }
                        }
                    }
                    /*End of New 1*/

                    if (!newModule.getLect().isEmpty()) {
                        listOfLectures.add(newModule.getLect());
                    }

                    if (!newModule.getLab().isEmpty()) {
                        listOfLabs.add(newModule.getLab());
                    }

                    if (!newModule.getSec().isEmpty()) {
                        listOfSectionals.add(newModule.getSec());
                    }

                    if (!newModule.getRec().isEmpty()) {
                        listOfRecitations.add(newModule.getRec());
                    }

                    if (!newModule.getTut().isEmpty()) {
                        listOfTutorials.add(newModule.getTut());
                    }
                }
            }

            if (!hasError) {
                //EDIT: Shifted up
                //Timetable tt = new Timetable(1);

                LessonSimulator simulator = new LessonSimulator(listOfLectures, listOfLabs, listOfTutorials, listOfRecitations, listOfSectionals, tt);
                confirmedTT = simulator.generate(null);
                if (confirmedTT.getPossible()) {
                    System.out.println(confirmedTT);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            timetableTextView.setText(confirmedTT.toString());
                        }
                    });
                } else {
                    //error: cannot print timetable
                    System.out.println("Error");
                    Intent errorTT = new Intent(getApplicationContext(), ErrorTimetable.class);
                    startActivity(errorTT);
                }
            }
        }
    }
}





