import DataStore.LordOfTheBeans;
import Processor.MarketDataProcessor;
import java.io.IOException;


/**
 * Created by Dylan on 17/02/2015.
 */
public class Baseplate {

    public static void main(String[] args) throws IOException {

        marketDataStore = LordOfTheBeans.getLordOfTheBeans();
        instantiateMarketData();

        MarketDataProcessor marketDataProcessor = new MarketDataProcessor();
        marketDataProcessor.PopulateProcessors(args[0]);
        marketDataProcessor.ProcessMarketData();

    }

    private static LordOfTheBeans marketDataStore;

    private static void instantiateMarketData() {
        marketDataStore.instantiateMasterBeans();
    }

}
