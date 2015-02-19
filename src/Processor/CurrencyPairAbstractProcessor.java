package Processor;

import DataStore.*;
import Library.CurrencySymbols;

/**
 * Created by Dylan on 19/02/2015.
 */
public abstract class CurrencyPairAbstractProcessor {

    private CurrencyPairMasterBean currencyPairBeanMaster = (CurrencyPairMasterBean) LordOfTheBeans.getLordOfTheBeans().getChildBean(AssetClass.CURRENCYPAIR.toString());

    public void addDataToStore (CurrencySymbols symbol1, CurrencySymbols symbol2, double ratio2) {
        CurrencyPairBean currencyPairBean = (CurrencyPairBean) currencyPairBeanMaster.getChildBean(symbol1.toString() + symbol2.toString());
        if (currencyPairBean == null) {
            currencyPairBean = new CurrencyPairBean(symbol1, symbol2, 1, ratio2);
            currencyPairBeanMaster.addChildBean(currencyPairBean);
        }
        updateDataStore(currencyPairBean, ratio2);
    }

    public void updateDataStore (CurrencyPairBean bean, double ratio2) {
        bean.priceUpdate(ratio2);
    }


}
