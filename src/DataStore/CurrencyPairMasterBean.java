package DataStore;

import Library.CurrencySymbols;

/**
 * Created by Dylan on 19/02/2015.
 */
public class CurrencyPairMasterBean extends AssetBean {

    public CurrencyPairMasterBean() {
        super(AssetClass.CURRENCYPAIR.toString(), AssetClass.CURRENCYPAIR);
    }

    public void createBean (CurrencySymbols currencySymbol1, CurrencySymbols currencySymbol2) {
        final CurrencyPairBean childBean = new CurrencyPairBean(currencySymbol1, currencySymbol2);
        childBeans.add(childBean);
    }

    public void createChildBean (CurrencySymbols currencySymbol1, CurrencySymbols currencySymbol2, double ratio1, double ratio2) {
        final CurrencyPairBean childBean = new CurrencyPairBean(currencySymbol1, currencySymbol2, ratio1, ratio2);
        childBeans.add(childBean);
    }

}
