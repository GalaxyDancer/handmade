package by.gal.handmade.api.entity;

import java.util.List;

/**
 * Interface of MenuItem entity
 * @author Den Galax
 * @version 2016/04/19
 */
public interface IMenuItem extends IEntity {

    String getName();
    void setName(String name);
    String getLink();
    void setLink(String link);  
    int getSortOrder();
    void setSortOrder(int order);
    List<IMenuItem> getChildItems();
    void setChildItems(List<IMenuItem> childItems);
    void addChildItem(IMenuItem menuItem);
    IMenuItem getParentItem();
    void setParentItem(IMenuItem item);
}
