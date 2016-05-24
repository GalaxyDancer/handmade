package by.gal.handmade.jdbc.entity;

import java.util.List;
import java.util.UUID;

import by.gal.handmade.api.entity.IMenuItem;

/**
 * @author Den Galax
 * @version 2016/04/19
 * Implementation of MenuItem entity
 */
public class MenuItem implements IMenuItem {
	
	private UUID id;
	private String name;
	private String link;
	private int sortOrder;
	private List<IMenuItem> childItems;	
	private IMenuItem parentItem;

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public void setId(UUID id) {
		this.id = id;		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public String getLink() {
		return link;
	}

	@Override
	public void setLink(String link) {
		this.link = link;		
	}

	@Override
	public int getSortOrder() {
		return sortOrder;
	}

	@Override
	public void setSortOrder(int order) {
		sortOrder = order;
		
	}

	@Override
	public List<IMenuItem> getChildItems() {
		return childItems;
	}
	
	@Override
	public void setChildItems(List<IMenuItem> childItems) {
		this.childItems = childItems;
	}

	@Override
	public void addChildItem(IMenuItem menuItem) {
		childItems.add(menuItem);		
	}

	@Override
	public IMenuItem getParentItem() {
		return parentItem;
	}

	@Override
	public void setParentItem(IMenuItem item) {
		parentItem = item;		
	}

}
