package DataStore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dylan on 19/02/2015.
 */
public abstract class Bean {

    public Bean (String beanName) {
        this.beanName = beanName;
    }

    private String beanName;
    public List<Bean> childBeans = new ArrayList<>();

    public String getBeanName() { return beanName; }
    public List<Bean> getChildBeans() { return childBeans; }

    public boolean hasChildBean () {
        if (childBeans.isEmpty()) {
            return false;
        }
        return true;
    }

    public Bean getChildBean(String beanName) {
        for (Bean childBean : childBeans){
            if (childBean.beanName.equals(beanName)) {
                return childBean;
            }
        }
        return null;
    }

    public void addChildBean(Bean bean) {
        childBeans.add(bean);
    }
}
