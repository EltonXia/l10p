package me.l10.api;

public interface GenericService<T, Id> {
	T findEntityById(Id id);

}
