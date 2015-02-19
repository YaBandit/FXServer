import DataStore.LordOfTheBeans;
import Processor.MarketDataProcessor;
import Sockets.SocketController;

import java.io.IOException;


/**
 * Created by Dylan on 17/02/2015.
 */
public class Baseplate {

    public static void main(String[] args) throws IOException {

        marketDataStore = LordOfTheBeans.getLordOfTheBeans();
        instantiateMarketData();

        //MarketDataProcessor marketDataProcessor = new MarketDataProcessor();
        //marketDataProcessor.PopulateProcessors(args[0]);
        //marketDataProcessor.ProcessMarketData();

        SocketController sc = new SocketController();
        sc.StartSockets();

    }

    private static LordOfTheBeans marketDataStore;

    private static void instantiateMarketData() {
        marketDataStore.instantiateMasterBeans();
    }

}
