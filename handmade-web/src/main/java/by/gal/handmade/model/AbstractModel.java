package by.gal.handmade.model;

/**
 * @author Den Galax
 * @version 2016/05/14
 * Base class of models
 */
public abstract class AbstractModel {

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
