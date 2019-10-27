package com.example.weather.Services;

import com.example.weather.Model.Weather;
import org.springframework.stereotype.Service;

@Service(value= "WeatherService")
public class WeatherService implements Iweather{


    @Override
    public Weather multiply(int a, int b) {
        Weather weather = new Weather(a,b);
        weather.setMultiple(a*b);
        return weather;
    }
}
