package Processor;

import DataStore.AssetClass;
import DataStore.Bean;
import DataStore.LordOfTheBeans;

/**
 * Created by Dylan on 19/02/2015.
 */
public abstract class CurrencyPairAbstractProcessor {

    private Bean currencyPairBean = LordOfTheBeans.getLordOfTheBeans().getChildBean(AssetClass.CURRENCYPAIR.toString());


}
