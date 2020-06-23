package com.example.myfirstapplication;

import java.util.List;

public class AllTutorial extends AllLesson {

    public AllTutorial(String moduleCode, List<Lesson> allTimings) {
        super(moduleCode, allTimings);
    }

    public String toString() {
        return "All Tuts";
    }
}
