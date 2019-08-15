package com.example.runtimeannotationprocessor.bean;

import com.example.runtimeannotationprocessor.annotation.FruitColor;
import com.example.runtimeannotationprocessor.annotation.FruitName;
import com.example.runtimeannotationprocessor.annotation.FruitProvider;

public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.BULE)
    private String appleColor;

    @FruitProvider(id = 1, name = "洪庄红富士集团", address = "洪庄村3号")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

}
