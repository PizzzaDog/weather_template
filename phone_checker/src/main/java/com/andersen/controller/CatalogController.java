package com.andersen.controller;

import com.andersen.dto.PhoneCatalogDto;
import com.andersen.service.PhoneCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @Autowired
    PhoneCatalogService phoneService;

    @GetMapping("/api/get_city")
    public PhoneCatalogDto getCityByNumber(@RequestParam String number) {
        return phoneService.getCityByNumber(number);
    }
}
