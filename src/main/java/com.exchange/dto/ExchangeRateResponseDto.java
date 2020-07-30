package com.exchange.dto;

import com.exchange.entity.CursValutar;

import java.time.LocalDate;

public class ExchangeRateResponseDto extends ExchangeRateDto {

    private LocalDate date;

    public ExchangeRateResponseDto(CursValutar cursValutar) {
        super(cursValutar);
        this.date = cursValutar.getCreatedOn();
    }

    public ExchangeRateResponseDto() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
