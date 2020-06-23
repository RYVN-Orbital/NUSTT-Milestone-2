package com.example.myfirstapplication;
/* added List package */
import java.util.List;

public class Tutorial extends Lesson {

    public Tutorial(String code, String number, int start, int end, String day, String venue, List<Integer> weeks, String typeOfLesson) {
        super(code, number, start, end, day, venue, weeks, typeOfLesson);
        //this.lessonType = Type.TUTORIAL;
    }
    /*
    @Override
    public Type getType() {
        return this.lessonType;
    }*/

    @Override
    public String toString() {
        return "TUT " + " " + super.toString();
    }
}
