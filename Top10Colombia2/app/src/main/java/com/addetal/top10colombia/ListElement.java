package com.addetal.top10colombia;

import java.io.Serializable;

public class ListElement implements Serializable {

    public String color;
    public String name;
    public String city;
    public String status;
    public String top;



    public ListElement(String color, String name, String city, String status, String top) {

        this.color = color;
        this.name = name;
        this.city = city;
        this.status = status;
        this.top = top;

    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getTop() {
        return top;
    }
}


