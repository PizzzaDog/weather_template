package com.andersen.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherApiResponseDto {
    private Double temp;
    private WC main;

    public String getTemp() {
        return this.main.temp.toString();
    }



    @Getter
    @Setter
    @NoArgsConstructor
    class WC {
        private Double temp;
    }
}
