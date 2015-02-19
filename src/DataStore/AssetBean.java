package DataStore;

/**
 * Created by Dylan on 19/02/2015.
 */
public class AssetBean extends BasicBean {

    private AssetClass assetClass;

    public AssetBean(String beanName, AssetClass assetClass) {
        super(beanName);
        this.assetClass = assetClass;
    }

    public AssetClass getAssetClass() { return assetClass; }





}
