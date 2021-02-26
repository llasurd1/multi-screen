package com.example.multi_screen.model;

public class Ping {
    private int numPressed = 0;

    public int getNumPressed() {
        return numPressed;
    }

    public void pressed() {
       numPressed++;
    }

}
