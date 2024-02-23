package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.CountryDTO;
import co.edu.unbosque.util.LinkedList;
import co.edu.unbosque.util.Node;

public class CountryDAO implements CRUDOperations {
	private LinkedList<CountryDTO> countrys;

	public CountryDAO() {
		countrys = new LinkedList<>();
	}

	@Override
	public void create(Object o) {
		countrys.addLast((CountryDTO) o);
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= countrys.size()) {
			return false;
		}
		Node<CountryDTO> delete = countrys.get(index);
		if (delete != null) {
			countrys.remove(delete.getInfo());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String show() {
		return countrys.print();
	}

	@Override
	public String showOne(Object o) {
		// TODO Auto-generated method stub
		return o.toString();
	}

	@Override
	public boolean update(int index, Object o) {
		if (index < 0 || index >= countrys.size()) {
			return false;
		}

		Node<CountryDTO> update = countrys.get(index);
		if (update != null) {
			update.setInfo((CountryDTO) o);
			return true;
		} else {
			return false;
		}
	}
}