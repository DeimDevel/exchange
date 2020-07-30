package com.exchange.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SchimbValutar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Valuta valuta;

    private String changeRate;
    private double givenSum;
    private double sentSum;

    public Long getId() {
        return id;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate;
    }

    public double getGivenSum() {
        return givenSum;
    }

    public void setGivenSum(double givenSum) {
        this.givenSum = givenSum;
    }

    public double getSentSum() {
        return sentSum;
    }

    public void setSentSum(double sentSum) {
        this.sentSum = sentSum;
    }
}
