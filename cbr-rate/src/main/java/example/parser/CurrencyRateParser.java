package example.parser;

import example.model.CurrencyRate;

import java.util.List;

public interface CurrencyRateParser {
    List<CurrencyRate> parse(String ratesAsString);
}
