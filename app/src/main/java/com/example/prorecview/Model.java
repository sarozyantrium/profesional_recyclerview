package com.example.prorecview;

public class Model
{
    String txt_one,txt_two;
    int image_view;

    public Model(String txt_one, String txt_two, int image_view) {
        this.txt_one = txt_one;
        this.txt_two = txt_two;
        this.image_view = image_view;
    }

    public String getTxt_one() {
        return txt_one;
    }

    public void setTxt_one(String txt_one) {
        this.txt_one = txt_one;
    }

    public String getTxt_two() {
        return txt_two;
    }

    public void setTxt_two(String txt_two) {
        this.txt_two = txt_two;
    }

    public int getImage_view() {
        return image_view;
    }

    public void setImage_view(int image_view) {
        this.image_view = image_view;
    }
}
