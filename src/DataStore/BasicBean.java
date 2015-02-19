package DataStore;

/**
 * Created by Dylan on 19/02/2015.
 */
public class BasicBean extends Bean implements BeanInterface {

    public BasicBean(String beanName) {
        super(beanName);
    }

    @Override
    public void createChildBean(String beanName) {
        final Bean childBean = new BasicBean(beanName);
        childBeans.add(childBean);
    }
}
