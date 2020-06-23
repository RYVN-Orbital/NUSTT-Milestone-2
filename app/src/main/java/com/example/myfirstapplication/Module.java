package com.example.myfirstapplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Module {
    protected final String moduleCode;
    protected final ArrayList<Lesson> lessons;
    protected AllLecture allLect;
    protected AllLab allLab;
    protected AllTutorial allTut;
    protected AllSectional allSec;
    protected AllRecitation allRec;


    public Module(String moduleCode, ArrayList<Lesson> arrayLesson) {
        this.moduleCode = moduleCode;
        this.lessons = arrayLesson;

        List<Lesson> listOfLectures = new ArrayList<>();
        List<Lesson> listOfTutorials = new ArrayList<>();
        List<Lesson> listOfRecitations = new ArrayList<>();
        List<Lesson> listOfSectionals = new ArrayList<>();
        List<Lesson> listOfLabs = new ArrayList<>();

        for (Lesson lesson : arrayLesson) {
            if (lesson.getType() == Type.LECTURE) {
                listOfLectures.add(lesson);
            } else if (lesson.getType() == Type.TUTORIAL) {
                listOfTutorials.add(lesson);
            } else if (lesson.getType() == Type.RECITATION) {
                listOfRecitations.add(lesson);
            } else if (lesson.getType() == Type.LAB) {
                listOfLabs.add(lesson);
            } else {
                listOfSectionals.add(lesson);
            }
        }
        Comparator<Lesson> comp = new LessonComparator();
        listOfLectures.sort(comp);
        listOfRecitations.sort(comp);
        listOfTutorials.sort(comp);
        listOfSectionals.sort(comp);
        listOfLabs.sort(comp);

        this.allLect = new AllLecture(this.moduleCode, listOfLectures);
        this.allRec = new AllRecitation(this.moduleCode, listOfRecitations);
        this.allTut = new AllTutorial(this.moduleCode, listOfTutorials);
        this.allSec = new AllSectional(this.moduleCode, listOfSectionals);
        this.allLab = new AllLab(this.moduleCode, listOfLabs);
    }

    public String getCode() {
        return this.moduleCode;
    }

    public AllLesson getLect() {
        return this.allLect;
    }

    public AllLesson getLab() {
        return this.allLab;
    }

    public AllLesson getRec() {
        return this.allRec;
    }

    public AllLesson getTut() {
        return this.allTut;
    }

    public AllLesson getSec() {
        return this.allSec;
    }

    @Override
    public String toString() {
        return this.moduleCode;
    }
}



