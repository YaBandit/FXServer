package Processor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dylan on 18/02/2015.
 */
public class MarketDataProcessor {

    List<Processor> processors = new ArrayList<Processor>();

    public void PopulateProcessors (String dataProviders) {
        final String[] dataProvidersArray = dataProviders.split(",");
        for (String provider : dataProvidersArray){
            switch (provider) {
                case "YAHOO":
                    YahooProcessor yahooProcessor = new YahooProcessor();
                    processors.add(yahooProcessor);
                    break;
            }
        }
    }

    public void ProcessMarketData() {
        for (Processor processor : processors){
            processor.ProcessMarketData();
        }
    }

}
