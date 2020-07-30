package com.exchange.dto;

import com.exchange.entity.CursValutar;

public class ExchangeRateDto {

    private String currency;
    private int exponent;
    private double exchangeRate;

    public ExchangeRateDto(CursValutar cursValutar) {
        this.currency = cursValutar.getCurrency();
        this.exponent = cursValutar.getExponent();
        this.exchangeRate = cursValutar.getExchangeRate();
    }

    public ExchangeRateDto() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
