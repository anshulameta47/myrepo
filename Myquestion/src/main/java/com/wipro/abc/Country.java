package com.wipro.abc;

public class Country {

	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", CountryName=" + CountryName + "]";
	}
	public String CountryId;
	public String CountryName;
	public String getCountryId() {
		return CountryId;
	}
	public void setCountryId(String countryId) {
		CountryId = countryId;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public Country(String countryId, String countryName) {
		super();
		CountryId = countryId;
		CountryName = countryName;
	}
	public Country()
	{
		
	}
}
