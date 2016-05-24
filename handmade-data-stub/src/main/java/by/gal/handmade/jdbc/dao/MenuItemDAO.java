package by.gal.handmade.jdbc.dao;

import by.gal.handmade.api.entity.IMenuItem;
import by.gal.handmade.jdbc.util.EntityBuilder;

public class MenuItemDAO extends AbstractEntityDAO<IMenuItem> {

	private static MenuItemDAO dao;
			
	public MenuItemDAO() {
		
		IMenuItem m1 = EntityBuilder.createEntity(IMenuItem.class);
		m1.setLink("index");
		m1.setName("label.home");
		m1.setSortOrder(0);
		getEntitiesMap().put(m1.getId(), m1);
		
		IMenuItem m2 = EntityBuilder.createEntity(IMenuItem.class);
		m2.setLink("catalog");
		m2.setName("label.catalog");
		m2.setSortOrder(100);
		getEntitiesMap().put(m2.getId(), m2);
		
	}

	public static synchronized MenuItemDAO getInstance(){
		if( dao == null ){
			dao = new MenuItemDAO();
		}
		return dao;
	}

}
