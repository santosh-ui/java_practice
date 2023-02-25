/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package currencyconverter;

/**
 *
 * @author Santosh
 */
public class Currency {
    private String currency;
    private double value;
    private double exchangeRate;
    
    public Currency(){}
    
    public Currency(String currency){
        this.currency = currency;
    }
    
    public Currency(String currency, double value, double exchangeRate) {
        this.currency = currency;
        this.value = value;
        this.exchangeRate = exchangeRate;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    public String getCurrency() {
        return currency;
    }
    
    public void setValue(double value) {
        if (value > 0.0) {
            this.value = value;
        } else {
            this.value = 0.0;
        }
    }
    
    public double getValue() {
        return value;
    }
    
    public void setExchangeRate(double exRate) {
        exchangeRate = exRate;
    }
    
    public double getExchangeRate() {
        return exchangeRate;
    }
    
    
}
