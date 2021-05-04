package com.example.carmanagementsystem;

import android.app.Application;

import java.util.ArrayList;

public class CarData extends Application {
    public static ArrayList<Information> information;

    @Override
    public void onCreate() {
        super.onCreate();
        information = new ArrayList<>();
        //Add Car Info


        information.add(new Information( R.drawable.volkswagen ,"Chuck Norris", "032199067543", "Polo"));
        information.add(new Information( R.drawable.nissan, "Peter Pollock", "030098263412", "E200"));
        information.add(new Information( R.drawable.mercedes, "Chris James", "021198091", "Almera"));
        information.add(new Information( R.drawable.volkswagen, "John Rambo", "067360012", "E180"));
        information.add(new Information(  R.drawable.nissan,"Neison Mandela", "03412345678", "Kombi"));
        information.add(new Information(  R.drawable.mercedes,"Jmaes Bond", "09280801122", "Jaguar"));

    }
}
