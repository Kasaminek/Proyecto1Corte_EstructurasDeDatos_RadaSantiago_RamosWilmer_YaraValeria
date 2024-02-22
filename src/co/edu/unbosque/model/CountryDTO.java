package co.edu.unbosque.model;

public class CountryDTO {
	
	private String countryName;
	private String currency;
	
	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CountryDTO(String countryName, String currency) {
		super();
		this.countryName = countryName;
		this.currency = currency;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "CountryDTO [countryName=" + countryName + ", currency=" + currency + "]";
	}
	
	


	


	
	
	
	

}