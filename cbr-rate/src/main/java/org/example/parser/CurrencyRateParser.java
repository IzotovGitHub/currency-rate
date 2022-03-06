package org.example.parser;

import org.example.model.CurrencyRate;

import java.util.List;

public interface CurrencyRateParser {
    List<CurrencyRate> parse(String ratesAsString);
}
