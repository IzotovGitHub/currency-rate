package org.example.clients;



import org.example.model.CurrencyRate;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface RateClient {

    Mono<CurrencyRate> getCurrencyRate(String currency, LocalDate date);
}
