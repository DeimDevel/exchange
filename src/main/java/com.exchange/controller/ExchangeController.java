package com.exchange.controller;

import com.exchange.dto.ExchangeRateDto;
import com.exchange.dto.ExchangeRateResponseDto;
import com.exchange.service.ExchangeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping("/api/exchange")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @ApiOperation(value = "Insereaza date pentru schimb valutar", response = ExchangeRateResponseDto.class)
    @RequestMapping(method = POST, path = "/add")
    public ResponseEntity<ExchangeRateDto> insertExchange(@RequestBody ExchangeRateDto rateDto) {
        return new ResponseEntity<>(exchangeService.insertExchangeData(rateDto), HttpStatus.OK);
    }

    @ApiOperation(value = "Verifica cursul existent pentru o valuta", response = ExchangeRateDto.class)
    @RequestMapping(method = GET, path = "/{currency}")
    public ResponseEntity<ExchangeRateResponseDto> getCurrentExchangeByCurrency(@PathVariable String currency) {
        return new ResponseEntity<>(exchangeService.getCurrentExchangeRate(currency), HttpStatus.OK);
    }



    //TODO Sorry I didn't fit in time to implement other two APIs, but the first two are working, really!

    @ApiOperation(value = "Cumpara valuta", response = ExchangeRateResponseDto.class)
    @RequestMapping(method = PUT, path = "/buy")
    public ResponseEntity<ExchangeRateDto> doExchange(@RequestBody ExchangeRateDto rateDto) {
        return new ResponseEntity<>(rateDto, HttpStatus.OK);
    }

    @ApiOperation(value = "Corecteaza o suma pe valute", response = ExchangeRateResponseDto.class)
    @RequestMapping(method = PUT, path = "/sum")
    public ResponseEntity<ExchangeRateDto> insertSumForCurrency(@RequestBody ExchangeRateDto rateDto) {
        return new ResponseEntity<>(rateDto, HttpStatus.OK);
    }

}
