package by.gal.handmade.jdbc.dao;

import java.util.Optional;

import by.gal.handmade.api.entity.IActivityType;
import by.gal.handmade.api.entity.IArtisan;
import by.gal.handmade.jdbc.util.EntityBuilder;

public class ArtisanDAO extends AbstractEntityDAO<IArtisan>{

	public ArtisanDAO() {
		ActivityTypeDAO activityTypeDAO = new ActivityTypeDAO();
		Optional<IActivityType> type1 = activityTypeDAO.getAll().stream().filter(e -> e.getName() == "Резьба по дереву").findFirst();
		Optional<IActivityType> type2 = activityTypeDAO.getAll().stream().filter(e -> e.getName() == "Вышивание").findFirst();

		IArtisan artisan1 = EntityBuilder.createEntity(IArtisan.class);
		artisan1.setName("Иван");
		artisan1.setSurname("Иванов");
		artisan1.setPatronymic("Иванович");
		artisan1.addActivityType(type1.get());
		getEntitiesMap().put(artisan1.getId(), artisan1);


		IArtisan artisan2 = EntityBuilder.createEntity(IArtisan.class);
		artisan2.setName("Петр");
		artisan2.setSurname("Петров");
		artisan2.setPatronymic("Петрович");
		artisan2.addActivityType(type2.get());
		getEntitiesMap().put(artisan2.getId(), artisan2);
	}
	
}
