package co.edu.unbosque.model;

import co.edu.unbosque.util.LinkedList;

public class WarehouseDTO {
	private String nameWarehouse;
	private LinkedList<Package> packages;

	public WarehouseDTO() {
		// TODO Auto-generated constructor stub
	}

	public WarehouseDTO(String nameWarehouse, LinkedList<Package> packages) {
		super();
		this.nameWarehouse = nameWarehouse;
		this.packages = packages;
	}

	public String getNameWarehouse() {
		return nameWarehouse;
	}

	public void setNameWarehouse(String nameWarehouse) {
		this.nameWarehouse = nameWarehouse;
	}

	public LinkedList<Package> getPackages() {
		return packages;
	}

	public void setPackages(LinkedList<Package> packages) {
		this.packages = packages;
	}
}