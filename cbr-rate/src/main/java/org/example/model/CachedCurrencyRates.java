package org.example.model;

import lombok.Value;

import java.util.List;

@Value
public class CachedCurrencyRates {
    List<CurrencyRate> currencyRates;
}
