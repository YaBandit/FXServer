package Processor;

import YahooMarketData.YahooApiOperators;
import YahooMarketData.YahooUrls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

/**
 * Created by Dylan on 18/02/2015.
 */
public class YahooProcessor extends CurrencyPairAbstractProcessor implements Processor,CurrencyPairProcessor{

    private final Map<String,String> currencyUrlCalls = YahooUrls.getINSTANCE().getCurrencyUrlCalls();

    // WRONG WAY OF STORING DATA
    private Map<String, String[]> currencyMarketData = new HashMap<>();

    @Override
    public void ProcessMarketData() {

        /* DESIRED OUTPUT:
        CURRENCY1,CURRENCY2,RATIO:RATIO
        CURRENCY1,CURRENCY2,RATIO:RATIO
        CURRENCY1,CURRENCY2,RATIO:RATIO
        AND SO ON FOR ALL OF THE DESIRED PAIRS
         */
        GetMarketData();

        // TEMP PRINTING
        Iterator iterator = currencyMarketData.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            StringBuilder output = new StringBuilder();
            for (String part : (String[]) pair.getValue()) {
                output.append(part);
                output.append(":");
            }
            System.out.println(output);
        }
    }

    @Override
    public void GetMarketData() {
        Iterator iterator = currencyUrlCalls.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            String[] result = PingCurrencyPairAPI((String) pair.getKey(), (String) pair.getValue());
            currencyMarketData.put((String) pair.getKey(), result);
        }
    }

    @Override
    public String[] PingCurrencyPairAPI(String pair, String url) {
        InputStream connection = null;
        String[] fields = new String[4];
        String[] pairArray = pair.split(YahooApiOperators.colon);
        fields[0] = pairArray[0];
        fields[1] = pairArray[1];

        try {
            connection = new URL(url).openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(connection);
            BufferedReader content = new BufferedReader(inputStreamReader);
            String[] result = content.readLine().split(",");
            content.close();

            fields[2] = "1";
            fields[3] = result[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fields;
    }
}
