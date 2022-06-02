package com.andersen.service;

import com.andersen.dto.PhoneCatalogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PhoneCatalogApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${constant.service.phone_service.api.url}")
    private String phoneCatalogServiceUrl;

    public String getCityByNymber(String number) {
        String finalUrl = phoneCatalogServiceUrl + "?number=" + number;
        PhoneCatalogDto message = restTemplate.getForObject(finalUrl, PhoneCatalogDto.class);

        return message.getCity();
    }
}
