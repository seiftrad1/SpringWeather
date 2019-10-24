package com.example.weather.Controller;

import com.example.weather.Model.Weather;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class WeatherController {

    @CrossOrigin
    @RequestMapping(value="/{n1}/{n2}",method= RequestMethod.POST)
    public Weather Add(@RequestBody Weather weather, @PathVariable int n1 , @PathVariable int n2) {
        weather.setNumber1(n1);
        weather.setNumber2(n2);
        weather.setMultiple(n1*n2);
        return weather;
    }

}

