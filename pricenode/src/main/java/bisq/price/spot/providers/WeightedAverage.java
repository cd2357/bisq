package bisq.price.spot.providers;

import bisq.price.spot.ExchangeRateProvider;

import java.util.Collections;
import java.util.Map;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class WeightedAverage {

    public static Map<Class<? extends ExchangeRateProvider>, Double> getWeightsForCurrencySwitch(String currency) {

        switch (currency) {

            case "USD":
                return ofEntries(
                        entry(Bitfinex.class, 2.2),
                        entry(Binance.class, 2.2)
                );

            // case "EUR":

            default:
                // All other currencies, for which no weights have been defined above
                return Collections.emptyMap();
        }

    }
}
