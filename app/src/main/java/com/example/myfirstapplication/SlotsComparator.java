package com.example.myfirstapplication;

import java.util.Comparator;

//compare start time
public class SlotsComparator implements Comparator<Lesson> {

    public int compare(Lesson l1, Lesson l2) {
        if (l1.getStartTime() < l2.getStartTime()) {
            return -1;
        } else if (l1.getStartTime() > l2.getStartTime()) {
            return 1;
        } else {
            return 0;
        }
    }
}