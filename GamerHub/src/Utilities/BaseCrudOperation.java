package Utilities;

public interface BaseCrudOperation<T> {
	void add(T entity);
	void delete(T entity);
	void update(T entity);
}
