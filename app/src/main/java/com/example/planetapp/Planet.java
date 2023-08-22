package com.example.planetapp;

public class Planet {

    // this class is acting as model class for our ListView
    //Attributes


    private String planetName;
    private String moonCount;

    private int planetImage;

    // constructor


    public Planet(String planetName,String moonCount,int planetImage) {
        this.planetName = planetName;
        this.moonCount=moonCount;
        this.planetImage=planetImage;

    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }
//getter setters


    public String getPlanetName() {
        return planetName;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }


}
