package com.example.ltc.pad.Models;

import android.widget.Toast;

/**
 * Created by leticiarodrigues on 24/07/2018.
 */

public class Song {

    public enum Ton {
        A(1), As(2), B(3), C(4), Cs(5), D(6), Ds(7), E(8), F(9), Fs(10), G(11), Gs(12);
        private int ton;

        Ton(int ton){
            this.ton = ton;
        }
    }

    private long id;
    private String padName;
    private Ton ton;

    //region Setters
    public void setTon(Ton ton) {
        this.ton = ton;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPadName(String padName) {
        this.padName = padName;
    }
    //endregion

    //region Getters
    public long getId() {
        return id;
    }

    public String getPadName() {
        return padName;
    }

    public Ton getTon() {
        return ton;
    }
    //endregion
}
