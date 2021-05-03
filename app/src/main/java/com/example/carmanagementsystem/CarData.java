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
        int[] image = Images.getAllImages();

        information.add(new Information( R.drawable.volkswagen ,"Chuck Norris", "+932199067543", "Polo"));
        information.add(new Information( R.drawable.nissan, "owner-Name", "poneNo", "carName"));
        information.add(new Information( R.drawable.mercedes, "owner-Name", "poneNo", "carName"));
        information.add(new Information( R.drawable.volkswagen, "owner-Name", "poneNo", "carName"));
        information.add(new Information(  R.drawable.nissan,"owner-Name", "poneNo", "carName"));
        information.add(new Information(  R.drawable.mercedes,"owner-Name", "poneNo", "carName"));

    }
}
