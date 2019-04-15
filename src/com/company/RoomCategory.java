package com.company;

public class RoomCategory {
    private float price;
    private float[] seasonMultiplier;

    public RoomCategory(float price, float m1, float m2, float m3, float m4, float m5, float m6, float m7, float m8, float m9, float m10, float m11, float m12) {
        this.price = price;
        this.seasonMultiplier = new float[]{m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
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
