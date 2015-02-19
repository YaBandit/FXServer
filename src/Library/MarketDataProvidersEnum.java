package Library;

/**
 * Created by Dylan on 19/02/2015.
 */
public enum MarketDataProvidersEnum {

    YAHOO("Yahoo");

    private final String marketDataProvider;

    MarketDataProvidersEnum(String marketDataProvider) {
        this.marketDataProvider = marketDataProvider;
    }

    public String getmarketDataProvider() {
        return marketDataProvider;
    }

}
