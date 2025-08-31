package com.wipro.stream;

public class FoodItem {
    private String foodName;
    private String typeOfFood;
    private double price;

    public FoodItem(String foodName, String typeOfFood, double price) {
        this.foodName = foodName;
        this.typeOfFood = typeOfFood;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + foodName + ", " + typeOfFood + ", " + price + "]";
    }
}
