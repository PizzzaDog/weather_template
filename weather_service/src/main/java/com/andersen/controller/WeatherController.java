package com.andersen.controller;

import com.andersen.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @GetMapping("/api/get_weather")
    public String getWeather(@RequestParam String city) {
        return weatherService.getWeatherByCity(city);
    }
}
