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

        startMarketDataThread(args[0]);

        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //SocketController sc = new SocketController();
        //sc.StartSockets();

    }

    private static LordOfTheBeans marketDataStore;

    private static void instantiateMarketData() {
        marketDataStore.instantiateMasterBeans();
    }

    private static void startMarketDataThread(String dataProviders) {
        new Thread(new MarketDataProcessor(dataProviders)).start();
    }

}
