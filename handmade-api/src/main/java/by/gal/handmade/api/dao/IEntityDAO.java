package by.gal.handmade.api.dao;

import java.util.List;
import java.util.UUID;

import by.gal.handmade.api.entity.IEntity;

public interface IEntityDAO<T extends IEntity> {
	T getById(UUID id);
	List<T> getAll();
	void add(T obj);
	void delete(UUID id);	
	void save(T obj);
}
