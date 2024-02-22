package co.edu.unbosque.model;

public class CountryDTO {
	
	private String countryName;
	private WarehouseDTO ware;
	
	
	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}


	public CountryDTO(String countryName, WarehouseDTO ware) {
		super();
		this.countryName = countryName;
		this.ware = ware;
	}


	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public WarehouseDTO getWare() {
		return ware;
	}

	public void setWare(WarehouseDTO ware) {
		this.ware = ware;
	}

	@Override
	public String toString() {
		return "CountryDTO [countryName=" + countryName + ", ware=" + ware + "]";
	}
	
	
	
	

}