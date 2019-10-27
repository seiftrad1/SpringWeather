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

    /*the rest api using the method POST in order to fill the object in the body with the two numbers
    after that we will get the object with the two numbers plus the result of the function provided in the service
    */
    @CrossOrigin
    @RequestMapping(value="/Multiply",method=RequestMethod.POST)
    public Weather multiplyNumbers(@RequestBody Weather weather) {

        return weatherService.multiply(weather.getNumber1(),weather.getNumber2());
    }
}

