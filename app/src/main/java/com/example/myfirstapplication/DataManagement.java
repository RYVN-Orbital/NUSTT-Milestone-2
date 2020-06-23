package com.example.myfirstapplication;

import java.util.ArrayList;

public class DataManagement {

    public static Module makeModule(String modCode, ArrayList<Lesson> lessonslist) {
        Module newModule = new Module(modCode, lessonslist);
        return newModule;
    }
}
