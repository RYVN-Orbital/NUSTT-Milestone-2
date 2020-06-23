package com.example.myfirstapplication;

import java.util.List;

public class AllLab extends AllLesson {

    public AllLab(String moduleCode, List<Lesson> allTimings) {
        super(moduleCode, allTimings);
    }

    public String toString() {
        return "All Labs";
    }

}