package by.gal.handmade.jdbc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import by.gal.handmade.api.entity.IEntity;
import by.gal.handmade.api.dao.IEntityDAO;

public abstract class AbstractEntityDAO<T extends IEntity> implements IEntityDAO<T> {

	protected Map<UUID, T> map; 
	
	protected Map<UUID, T> getEntitiesMap(){
		if( map == null ){
			map = new HashMap<UUID, T>();
		}
		return map;
	}
	
	@Override
	public T getById(UUID id) {
		return getEntitiesMap().get(id);
	}
	
	@Override
	public List<T> getAll() {
		return new ArrayList<T>(getEntitiesMap().values());
	}

	@Override
	public void add(T obj) {
		getEntitiesMap().put(obj.getId(), obj);
		
	}

	@Override
	public void delete(UUID id) {
		getEntitiesMap().remove(id);
		
	}

	@Override
	public void save(T obj) {
		// TODO Auto-generated method stub
		
	}

}
