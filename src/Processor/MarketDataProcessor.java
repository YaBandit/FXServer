package Processor;

import Library.MarketDataProvidersEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dylan on 18/02/2015.
 */
public class MarketDataProcessor implements Runnable {

    private final static String SEPERATOR = ",";

    List<Processor> processors = new ArrayList<>();

    public MarketDataProcessor(String dataProviders) {
        final String[] dataProvidersArray = dataProviders.split(SEPERATOR);
        for (String provider : dataProvidersArray){
            final MarketDataProvidersEnum dataProvider = MarketDataProvidersEnum.valueOf(provider);
            switch (dataProvider) {
                case YAHOO:
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

    @Override
    public void run() {
        while (true) {
            ProcessMarketData();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
