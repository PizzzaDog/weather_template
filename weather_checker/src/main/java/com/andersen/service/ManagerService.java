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

    public MessageDto getWeatherByPhoneNumber(String number) {
        //Replacement of %2B or space in number
        number = number.replaceFirst("[ |+]", "");
        String city = phoneService.getCityByNymber(number);
        String weather = weatherService.getWeatherByCity(city);
        MessageDto message = new MessageDto();
        message.setNumber(number);
        message.setWeather(weather);
        message.setMessage("City - " + city);
        return message;
    }

}
