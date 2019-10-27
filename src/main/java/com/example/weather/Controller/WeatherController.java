package com.example.weather.Controller;

import com.example.weather.Model.Weather;
import com.example.weather.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class WeatherController {

    @Autowired
    private WeatherService weatherService ;
    @CrossOrigin
    @RequestMapping(value="/Multiply",method=RequestMethod.POST)
    public Weather multiplyNumbers(@RequestBody Weather weather) {

        return weatherService.multiply(weather.getNumber1(),weather.getNumber2());
    }
}

