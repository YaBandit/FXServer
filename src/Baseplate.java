import Processor.MarketDataProcessor;

import java.io.IOException;


/**
 * Created by Dylan on 17/02/2015.
 */
public class Baseplate {

    public static void main(String[] args) throws IOException {

        MarketDataProcessor marketDataProcessor = new MarketDataProcessor();
        marketDataProcessor.PopulateProcessors(args[0]);
        marketDataProcessor.ProcessMarketData();


    }

    private static final String historicalDataUrl = "http://ichart.finance.yahoo.com/table.csv";

}
