package com.example.weather.Model;

import org.springframework.stereotype.Component;

@Component
public class Weather {
    private int number1;
    private int number2;
    private int multiple;
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public Weather(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Weather() {
    }

    @Override
    public String toString() {
        return "Weather{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
