package co.edu.unbosque.model.persistence;

public interface CRUDOperations {
	public void create(Object o);

	public boolean delete(int index);

	public String show();

	public String showOne(Object o);

	public boolean update(int index, Object o);
}