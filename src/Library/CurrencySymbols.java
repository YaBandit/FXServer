package Library;

/**
 * Created by Dylan on 18/02/2015.
 */
public enum CurrencySymbols {

    GBP("GBP"),
    USD("USD"),
    EUR("EUR"),
    CHF("CHF"),
    JPY("JPY"),
    AUD("AUD"),
    CAD("CAD");

    private final String currencySymbol;

    CurrencySymbols(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

}
