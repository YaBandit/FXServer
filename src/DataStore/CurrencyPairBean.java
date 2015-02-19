package DataStore;

import Library.CurrencySymbols;

/**
 * Created by Dylan on 19/02/2015.
 */
public class CurrencyPairBean extends AssetBean {

    public CurrencyPairBean(String beanName, CurrencySymbols currencySymbol1, CurrencySymbols currencySymbol2) {
        super(beanName, AssetClass.CURRENCYPAIR);
        this.currencySymbol1 = currencySymbol1;
        this.currencySymbol2 = currencySymbol2;
    }

    public CurrencyPairBean(String beanName, CurrencySymbols currencySymbol1, CurrencySymbols currencySymbol2, double ratio1, double ratio2) {
        super(beanName, AssetClass.CURRENCYPAIR);
        this.currencySymbol1 = currencySymbol1;
        this.currencySymbol2 = currencySymbol2;
        this.currencyRatio1 = ratio1;
        this.currencyRatio2 = ratio2;
        instantiated = true;
    }

    final private CurrencySymbols currencySymbol1;
    final private CurrencySymbols currencySymbol2;

    private double currencyRatio1 = 1;
    private double currencyRatio2 = 1;

    private volatile boolean instantiated = false;

    public CurrencySymbols getCurrencySymbol1() { return currencySymbol1; }
    public CurrencySymbols getCurrencySymbol2() { return currencySymbol2; }

    public double getCurrencyRatio1() { return currencyRatio1; }
    public void setCurrencyRatio1(double currencyRatio1) { this.currencyRatio1 = currencyRatio1; }
    public double getCurrencyRatio2() { return currencyRatio2; }
    public void setCurrencyRatio2(double currencyRatio2) { this.currencyRatio2 = currencyRatio2; }




}
