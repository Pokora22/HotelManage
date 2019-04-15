package com.company;

public class RoomCategory {
    private float price;
    private float[] seasonMultiplier;

    public RoomCategory(float price) {
        this.price = price;
        this.seasonMultiplier = new float[12];
        for (int i = 0; i < 12; i++) {
            seasonMultiplier[i] = 1;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float[] getSeasonMultiplier() {
        return seasonMultiplier;
    }

    public void setSeasonMultiplier(float[] seasonMultiplier) {
        this.seasonMultiplier = seasonMultiplier;
    }
}
