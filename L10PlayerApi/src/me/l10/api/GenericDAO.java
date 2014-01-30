package me.l10.api;

public interface GenericDAO<T, Id> {
	T findEntityById(Id id);

	Id saveEntity(T t);

	T removeEntity(T t);
	
	T fetchEntity(T t);
}
