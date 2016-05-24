package by.gal.handmade.api.service;

import java.util.List;
import java.util.UUID;

import by.gal.handmade.api.entity.IEntity;

/**
 * @author Den Galax
 * @version 2016/04/19
 * Interface of universal Repository
 */
public interface IRepository {

	<T extends IEntity> T getById(UUID id, Class<T> type);
	<T extends IEntity> void add(T obj);
	<T extends IEntity> void delete(UUID id, Class<T> type);
	<T extends IEntity> List<T> getAll(Class<T> type);
	<T extends IEntity> void save(T obj);
}
