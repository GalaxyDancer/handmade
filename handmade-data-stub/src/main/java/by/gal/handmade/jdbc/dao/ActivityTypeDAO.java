package by.gal.handmade.jdbc.dao;

import by.gal.handmade.api.entity.IActivityType;
import by.gal.handmade.jdbc.util.EntityBuilder;

public class ActivityTypeDAO extends AbstractEntityDAO<IActivityType> {

	private static ActivityTypeDAO dao;

	public ActivityTypeDAO() {
		IActivityType type1 = EntityBuilder.createEntity(IActivityType.class);
		type1.setName("Резьба по дереву");		
		getEntitiesMap().put(type1.getId(), type1);
		
		IActivityType type2 = EntityBuilder.createEntity(IActivityType.class);
		type2.setName("Вышивание");
		getEntitiesMap().put(type2.getId(), type2);		
	}

	public static synchronized ActivityTypeDAO getInstance() {
		if (dao == null) {
			dao = new ActivityTypeDAO();
		}
		return dao;
	}

}
