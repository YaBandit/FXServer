package DataStore;

/**
 * LORD OF THE BEANS
 *
 * This is the one true master bean. The one main source of market data that is read from and
 * written to.
 *
 * Ye Be Warned. Here Be Monsters.
 *
 * Created by Dylan on 19/02/2015.
 */
public class LordOfTheBeans extends BasicBean {

    private static LordOfTheBeans lordOfTheBeans = new LordOfTheBeans("LordOfTheBeans");
    public static LordOfTheBeans getLordOfTheBeans() { return lordOfTheBeans; }

    public LordOfTheBeans(String beanName) {
        super(beanName);
    }

    public void instantiateMasterBeans() {
        childBeans.add(new CurrencyPairMasterBean());
    }
}
