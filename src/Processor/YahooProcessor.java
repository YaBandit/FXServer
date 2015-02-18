package Processor;

import YahooMarketData.Urls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Dylan on 18/02/2015.
 */
public class YahooProcessor implements Processor{

    @Override
    public void ProcessMarketData() {

        /* DESIRED OUTPUT:
        CURRENCY1,CURRENCY2,RATIO:RATIO
        CURRENCY1,CURRENCY2,RATIO:RATIO
        CURRENCY1,CURRENCY2,RATIO:RATIO
        AND SO ON FOR ALL OF THE DESIRED PAIRS
         */
        GetMarketData();

    }

    @Override
    public void GetMarketData() {

        StringBuilder nonsense = new StringBuilder(Urls.yahooApiAdress);
        //nonsense.append("s=ARM.L");
        nonsense.append("s=XOM+BBDb.TO+JNJ+MSFT&f=snd1l1yr");

        try {
            PingURL(nonsense.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void PingURL(String url) throws IOException {
        InputStream connection = new URL(url).openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(connection);
        BufferedReader content = new BufferedReader(inputStreamReader);
        String fields[] = content.readLine().split(",");
        content.close();
    }
}
