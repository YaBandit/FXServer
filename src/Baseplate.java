import Processor.MarketDataProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by Dylan on 17/02/2015.
 */
public class Baseplate {

    public static void main(String[] args) throws IOException {

        MarketDataProcessor marketDataProcessor = new MarketDataProcessor();
        marketDataProcessor.PopulateProcessors(args[0]);


    }

    private static final String fundamentalDataUrl = "http://finance.yahoo.com/d/quotes.csv";
    private static final String historicalDataUrl = "http://ichart.finance.yahoo.com/table.csv";
    private final DateFormat df = new SimpleDateFormat("y-M-d");

    public static void getDataSnapshot() throws IOException{

        StringBuilder reqUrl = new StringBuilder(fundamentalDataUrl);
        reqUrl.append("?s=ARM.L");
        reqUrl.append("&Yahoo=va2j1r");

        BufferedReader content = new BufferedReader(new InputStreamReader(new URL(reqUrl.toString()).openStream()));
        String fields[] = content.readLine().split(",");
        content.close();


        System.out.println("yolo");
    }




}
