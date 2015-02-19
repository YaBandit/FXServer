package YahooMarketData;

import Library.CurrencySymbols;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dylan on 18/02/2015.
 */
public class YahooUrls {

    private static YahooUrls INSTANCE = new YahooUrls();

    private Map<String,String> currencyUrlCalls = new HashMap<String,String>();

    public static YahooUrls getINSTANCE() { return INSTANCE; }
    public Map<String,String> getCurrencyUrlCalls() { return currencyUrlCalls; }

    public static final String yahooApiAdress = "http://finance.yahoo.com/d/quotes.csv?";

    public YahooUrls() {
        currencyBuilder(CurrencySymbols.GBP, CurrencySymbols.USD);
        currencyBuilder(CurrencySymbols.GBP, CurrencySymbols.EUR);
        currencyBuilder(CurrencySymbols.USD, CurrencySymbols.EUR);
        currencyBuilder(CurrencySymbols.USD, CurrencySymbols.CHF);
        currencyBuilder(CurrencySymbols.USD, CurrencySymbols.JPY);
        currencyBuilder(CurrencySymbols.USD, CurrencySymbols.AUD);
        currencyBuilder(CurrencySymbols.USD, CurrencySymbols.CAD);
        currencyBuilder(CurrencySymbols.GBP, CurrencySymbols.CHF);
        currencyBuilder(CurrencySymbols.GBP, CurrencySymbols.JPY);
        currencyBuilder(CurrencySymbols.GBP, CurrencySymbols.AUD);
        currencyBuilder(CurrencySymbols.GBP, CurrencySymbols.CAD);
        currencyBuilder(CurrencySymbols.EUR, CurrencySymbols.CHF);
        currencyBuilder(CurrencySymbols.EUR, CurrencySymbols.JPY);
        currencyBuilder(CurrencySymbols.EUR, CurrencySymbols.AUD);
        currencyBuilder(CurrencySymbols.EUR, CurrencySymbols.CAD);
        currencyBuilder(CurrencySymbols.CHF, CurrencySymbols.JPY);
        currencyBuilder(CurrencySymbols.CHF, CurrencySymbols.AUD);
        currencyBuilder(CurrencySymbols.CHF, CurrencySymbols.CAD);
        currencyBuilder(CurrencySymbols.JPY, CurrencySymbols.AUD);
        currencyBuilder(CurrencySymbols.JPY, CurrencySymbols.CAD);
        currencyBuilder(CurrencySymbols.AUD, CurrencySymbols.CAD);
    }

    public void currencyBuilder(CurrencySymbols currency1, CurrencySymbols currency2) {
        StringBuilder url = new StringBuilder(YahooUrls.yahooApiAdress);
        url.append(YahooApiOperators.currencyPrecursor);
        url.append(YahooApiOperators.symbolEquals);
        url.append(currency1);
        url.append(currency2);
        url.append(YahooApiOperators.equalsX);

        StringBuilder currencyPair = new StringBuilder(currency1.getCurrencySymbol());
        currencyPair.append(YahooApiOperators.colon);
        currencyPair.append(currency2);
        currencyUrlCalls.put(currencyPair.toString(), url.toString());
    }

}
