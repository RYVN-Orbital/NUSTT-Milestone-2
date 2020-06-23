package com.example.myfirstapplication;
import java.util.List;

public class AllRecitation extends AllLesson {

    public AllRecitation(String moduleCode, List<Lesson> allTimings) {
        super(moduleCode, allTimings);
    }

    public String toString() {
        return "All Recs";
    }

}

