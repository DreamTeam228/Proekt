package com.example.proekt;

import java.util.jar.Attributes;

public class Place {
    private String description,location,name,picture,price,time;

    public Place (String description,String location,String name,String picture,String price, String time)
    {
        this.description = description;
        this.location = location;
        this.name = name;
        this.picture = picture;
        this.price = price;
        this.time = time;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public String getLocation()
    {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getPrice() {
        return price;
    }

    public String getPicture() {
        // Сюда нужен код для получения картинки и ее обработки BitMap
        return picture;
    }
}

