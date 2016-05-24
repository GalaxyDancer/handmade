package by.gal.handmade.service.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import by.gal.handmade.api.entity.*;
import by.gal.handmade.jdbc.dao.*;
import by.gal.handmade.api.dao.IEntityDAO;
import by.gal.handmade.api.service.IRepository;

public class Repository implements IRepository {
	
	private Map<Class<?>, IEntityDAO<?>> daos;
	
	@SuppressWarnings("unchecked")
	private <T extends IEntity> IEntityDAO<T> getDAO(Class<T> type){
		if( daos == null ){
			daos = new HashMap<>();
			daos.put(IMenuItem.class, MenuItemDAO.getInstance());
			daos.put(IActivityType.class, ActivityTypeDAO.getInstance());
			daos.put(IArtisan.class, ArtisanDAO.getInstance());
			daos.put(IUserRole.class, UserRoleDAO.getInstance());
			daos.put(IUser.class, UserDAO.getInstance());
		}
		return (IEntityDAO<T>) daos.get(type);
	}

	@Override
	public <T extends IEntity> T getById(UUID id, Class<T> type) {
		T result = null;
		IEntityDAO<T> dao = getDAO(type);
		if( dao != null)
			result = dao.getById(id);
		return result;
	}

	@Override
	public <T extends IEntity> void add(T obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends IEntity> void delete(UUID id, Class<T> type) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends IEntity> List<T> getAll(Class<T> type) {
		List<T> result = null;
		IEntityDAO<T> dao = getDAO(type);
		if( dao != null)
			result = dao.getAll();
		return result;
	}

	@Override
	public <T extends IEntity> void save(T obj) {
		// TODO Auto-generated method stub

	}

}
