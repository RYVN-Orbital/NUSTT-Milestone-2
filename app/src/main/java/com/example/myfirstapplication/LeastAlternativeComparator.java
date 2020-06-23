package com.example.myfirstapplication;

import java.util.Comparator;

//least no of alt days, least alt lessons, followed by module code
public class LeastAlternativeComparator implements Comparator<AllLesson> {

    public int compare(AllLesson l1, AllLesson l2) {
        if (l1.getUniqueDays() < l2.getUniqueDays()) {
            return -1;
        } else if (l1.getUniqueDays() > l2.getUniqueDays()) {
            return 1;
        } else {
            if (l1.numAltLesson() < l2.numAltLesson()) {
                return -1;
            } else if (l1.numAltLesson() > l2.numAltLesson()) {
                return 1;
            } else {
                return l1.getCode().compareTo(l2.getCode());
            }
        }
    }
}
