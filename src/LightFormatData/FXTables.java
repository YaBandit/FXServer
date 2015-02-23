package LightFormatData;

import Library.CurrencySymbols;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dylan on 22/02/2015.
 */
public class FXTables {

    private static volatile double[][] currencyTable;
    private Map<CurrencySymbols,Integer> currencyMappings = new HashMap();

    public FXTables(List<CurrencySymbols> symbols) {
        currencyTable = new double[symbols.size()-1][symbols.size()-1];
        for (int i = 0; i < symbols.size(); i++) {
            currencyMappings.put(symbols.get(i), i);
        }
    }

    public void currencyMapping() {

    }

    public void updateData(CurrencySymbols symbol1, CurrencySymbols symbol2, double ratio1) {
        int location1 = currencyMappings.get(symbol1);
        int location2 = currencyMappings.get(symbol2);
        double ratio2 = 1/ratio1;
        currencyTable[location1][location2] = ratio1;
        currencyTable[location2][location1] = ratio2;
    }

}
