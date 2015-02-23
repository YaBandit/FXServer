import DataStore.LordOfTheBeans;
import Library.CurrencySymbols;
import LightFormatData.FXTables;
import Processor.MarketDataProcessor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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
        List<CurrencySymbols> fxSymbols = new ArrayList<>();
        for (CurrencySymbols symbol : CurrencySymbols.values()) {
            fxSymbols.add(symbol);
        }
        FXTables fxTables = FXTables.getInstance();
        fxTables.instantiateFXTable(fxSymbols);
    }

    private static void startMarketDataThread(String dataProviders) {
        new Thread(new MarketDataProcessor(dataProviders)).start();
    }

}
