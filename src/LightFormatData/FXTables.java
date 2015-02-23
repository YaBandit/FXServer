package LightFormatData;

import Library.CurrencySymbols;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dylan on 22/02/2015.
 */
public class FXTables {

    private static final FXTables INSTANCE = new FXTables();
    private volatile double[][] currencyTable;
    private final Map<CurrencySymbols,Integer> currencyMappings = new HashMap();

    public double[][] getCurrencyTable() {
        return currencyTable;
    }

    public static FXTables getInstance() {
        return INSTANCE;
    }

    public void instantiateFXTable(List<CurrencySymbols> symbols) {
        currencyTable = new double[symbols.size()][symbols.size()];
        for (int i = 0; i < symbols.size(); i++){
            currencyTable[i][i] = 1;
        }
        for (int i = 0; i < symbols.size(); i++) {
            currencyMappings.put(symbols.get(i), i);
        }
    }

    public void updateData(CurrencySymbols symbol1, CurrencySymbols symbol2, double ratio2) {
        final int location1 = currencyMappings.get(symbol1);
        final int location2 = currencyMappings.get(symbol2);
        currencyTable[location1][location2] = ratio2;
        currencyTable[location2][location1] = 1/ratio2;
    }

}
