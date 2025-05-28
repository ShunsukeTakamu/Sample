package services;

import java.util.ArrayList;

public abstract class Service<T> {
	public abstract ArrayList<T> select();
	public abstract T selectById(int id);
	public abstract int insert(T object);
	public abstract void update(T object);
	public abstract void delete(int id);
}
