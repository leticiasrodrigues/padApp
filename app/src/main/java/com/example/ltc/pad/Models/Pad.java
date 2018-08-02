package com.example.ltc.pad.Models;

import android.media.Image;
import android.widget.ImageButton;

/**
 * Created by leticiarodrigues on 24/07/2018.
 */

public class Pad {

    private String name;
    private Image image;

    public Pad (String name){
        setName(name);
    }

    //region Getters
    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    //endregion

    //region Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    //endregion
}
