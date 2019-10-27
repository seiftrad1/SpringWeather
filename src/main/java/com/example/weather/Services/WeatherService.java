package com.example.weather.Services;

import com.example.weather.Model.Weather;
import org.springframework.stereotype.Service;

@Service(value= "WeatherService")
public class WeatherService implements Iweather{

    //this function take two variables in which we calculate the multiplication of both of them and return an object
    //that contain the two numbers plus the result of the operation
    @Override
    public Weather multiply(int a, int b) {
        Weather weather = new Weather(a,b);
        weather.setMultiple(a*b);
        return weather;
    }
}
