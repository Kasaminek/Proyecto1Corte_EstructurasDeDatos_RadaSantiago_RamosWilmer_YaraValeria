package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.util.LinkedList;

public class WarehouseDAO implements CRUDOperations {
	
	private LinkedList<PackageDTO> packages;
	private final String SERIAL_FILENAME = "apuestas.dat";
	
	public WarehouseDAO() {
		packages = new LinkedList<>();
		loadSerializable();
	}
	
	@SuppressWarnings("unchecked")
	private void loadSerializable() {
		if (FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME) != null) {
			Object temp = FileHandler.serializableOpenAndReadFile(SERIAL_FILENAME);
			packages = (LinkedList<PackageDTO>) temp;
		} else {
			packages = new LinkedList<>();
		}
	}
	
	public void writeSerializable() {
		FileHandler.serializableOpenAndWriteFile(SERIAL_FILENAME, packages);
	}

	@Override
	public void create(Object o) {
		packages.addLast((PackageDTO) o);
		writeSerializable();
	}
	
	@Override
	public boolean delete(int index) {
		
		if (index < 0 || index >= packages.size()) {
			return false;
		}
		
		PackageDTO delete = packages.get(index).getInfo();

		if(packages.contains(delete)) {
		packages.remove(delete);	
		}
        writeSerializable();
		return false;
	}

	public LinkedList<PackageDTO> getPackages() {
		return packages;
	}

	public void setPackages(LinkedList<PackageDTO> packages) {
		this.packages = packages;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return packages.print();
	}

	@Override
	public String showOne(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(int index, Object o) {
	    if (index < 0 || index >= packages.size()) {
	        return false;
	    }

	   return true;
	}

	
	int index=0;
	public PackageDTO searchBySerialNumber(long serial) {
		
		if(packages.get(index).getInfo().getSerialNumber()==serial) {
			return packages.get(index).getInfo();
		}
		
		if(packages.get(index).getInfo().getSerialNumber()==0) {
			return null;
		}
		
		index++;
		
		return searchBySerialNumber(serial);
		
	}
	
	public String searchByPackageContent(String content) {
		
		String packCont= packages.get(index).getInfo().getPackageContent();
		
		if(packCont.equalsIgnoreCase(content)) {
			return packages.get(index).getInfo().toString();
		}
		
		if(packCont.equals(null)) {
			return "Objeto no encontrado";
		}
		
		if(content==null) {
			return "No encontrado";
		}
		
		index++;
		
		return searchByPackageContent(content);
		
	}

}