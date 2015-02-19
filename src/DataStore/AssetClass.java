package DataStore;

/**
 * Created by Dylan on 19/02/2015.
 */
public enum AssetClass {

    CURRENCYPAIR("CurrencyPair"),
    CURRENCY("Currency"),
    EQUITY("Equity"),
    OPTION("Option"),
    FUTURE("Future");

    private final String assetClass;

    AssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getAssetClass() {
        return assetClass;
    }

}