package com.example.carmanagementsystem;

public class Images {
    public static int[] images;

    public Images() {
    }

    //Static Image Library using Drawable Image Id's
    public static int[] getAllImages() {

        int[] image = {R.drawable.volkswagen, R.drawable.nissan, R.drawable.mercedes };
        return image;
    }
}
