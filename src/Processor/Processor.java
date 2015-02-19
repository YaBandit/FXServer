package Processor;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by Dylan on 18/02/2015.
 */
public interface Processor {

    public void ProcessMarketData();

    public void GetMarketData() throws IOException;

    public String[] PingCurrencyURL(String pair, String URL) throws IOException;

}
