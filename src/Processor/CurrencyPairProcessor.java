package Processor;

import java.io.IOException;

/**
 * Created by Dylan on 19/02/2015.
 */
public interface CurrencyPairProcessor{

    public String[] PingCurrencyPairAPI(String pair, String URL);

}
