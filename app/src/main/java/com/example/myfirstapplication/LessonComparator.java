package com.example.myfirstapplication;
import java.util.Comparator;

//if same lesson number, compare day n time
//if not the same lesson number, compare time first then day and lastly, lesson number
public class LessonComparator implements Comparator<Lesson> {

    public int compare(Lesson l1, Lesson l2) {
        //in the same set/pair
        //EDIT: Remove 1 condition
        if (l1.getNum().equals(l2.getNum()) /*&& l1.getWeeks() == l2.getWeeks()*/) {
            if (l1.getDay() < l2.getDay()) {
                return -1;
            } else if (l1.getDay() > l2.getDay()) {
                return 1;
            } else {    //same day
                if (l1.getStartTime() < l2.getStartTime()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else {	//not in a pair
            if (l1.getStartTime() == l2.getStartTime()) {	//same start time
                if (l1.getDay() == l2.getDay()) {
                    //same day, same time, check for odd/even week
                    if (l1.getTypeOfWeeks().equals("Odd weeks") && l2.getTypeOfWeeks().equals("Even weeks")) {
                        return -1;
                    } else if (l1.getTypeOfWeeks().equals("Even weeks") && l2.getTypeOfWeeks().equals("Odd weeks")) {
                        return 1;
                        //if not, check for lesson num
                    } else {
			/* New 1
                        if (l1.getNum() < l2.getNum()) {
                            return -1;
                        } else {
                            return 1;
                        }
			*/
                        return l1.getNum().compareTo(l2.getNum());
                    }
                } else if (l1.getDay() < l2.getDay()) {
                    return -1;
                } else {
                    return 1;
                }

            } else if (l1.getStartTime() < l2.getStartTime()) {
                return -1;

            } else {
                return 1;
            }
        }
    }
}

