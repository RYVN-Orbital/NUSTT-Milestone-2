package com.example.myfirstapplication;
import java.util.List;

public class AllLecture extends AllLesson {

    public AllLecture(String moduleCode, List<Lesson> allTimings) {
        super(moduleCode, allTimings);
    }

    public String toString() {
        return "All Lectures";
    }

}
