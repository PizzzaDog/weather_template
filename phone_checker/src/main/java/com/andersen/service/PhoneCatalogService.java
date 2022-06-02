package com.andersen.service;

import com.andersen.dto.PhoneCatalogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PhoneCatalogService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${constant.phone.api.url}")
    private String apiUrl;

    public PhoneCatalogDto getCityByNumber(String number) {
        String finalUrl = apiUrl + number;
        PhoneCatalogDto response = restTemplate.getForObject(finalUrl, PhoneCatalogDto.class);
        if (response == null) {
            System.out.println("Exception should be here");
        } else {
            response.setNumber(number);
        }
        return response;
    }
}
