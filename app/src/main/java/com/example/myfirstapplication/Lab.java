package com.example.myfirstapplication;
        import java.util.List;

public class Lab extends Lesson {

    public Lab(String code, String number, int start, int end, String day, String venue, List<Integer> weeks, String typeOfLesson) {
        super(code, number, start, end, day, venue, weeks, typeOfLesson);
        //this.lessonType = Type.LAB;
    }

    /*
    @Override
    public Type getType() {
        return this.lessonType;
    }*/

    @Override
    public String toString() {
        return "LAB " + " " + super.toString();
    }

}

