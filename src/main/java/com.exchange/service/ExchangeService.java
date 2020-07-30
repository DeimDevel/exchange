package com.exchange.service;

import com.exchange.dto.ExchangeRateDto;
import com.exchange.dto.ExchangeRateResponseDto;
import com.exchange.entity.CursValutar;
import com.exchange.repository.CursValutarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Currency;

@Service
public class ExchangeService {

    @Autowired
    private CursValutarRepository cursValutarRepository;

    public ExchangeRateDto insertExchangeData(ExchangeRateDto rateDto) {
        Currency instance = Currency.getInstance(rateDto.getCurrency());//validate currency code
        CursValutar cursValutar = new CursValutar();

        cursValutar.setCurrency(instance.getCurrencyCode());
        cursValutar.setExchangeRate(rateDto.getExchangeRate());
        cursValutar.setExponent(rateDto.getExponent());
        cursValutar.setCreatedOn(LocalDate.now());

        cursValutarRepository.save(cursValutar);

        return new ExchangeRateResponseDto(cursValutar);
    }

    public ExchangeRateResponseDto getCurrentExchangeRate(String currency) {
        CursValutar cursValutar = cursValutarRepository.getByCurrency(currency).orElseThrow(() ->
            new IllegalArgumentException("Not found exchange rate info by given currency")
        );

        return new ExchangeRateResponseDto(cursValutar);
    }
}
