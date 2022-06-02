package com.andersen.service;

import com.andersen.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    PhoneCatalogApiService phoneService;

    @Autowired
    WeatherService weatherService;

    public MessageDto getWeatherByPhoneNumber(String numer) {
        String city = phoneService.getCityByNymber(numer);
        String weather = weatherService.getWeatherByCity(city);
        MessageDto message = new MessageDto();
        message.setNumber(numer);
        message.setWeather(weather);
        message.setMessage("City - " + city);
        return message;
    }

}
