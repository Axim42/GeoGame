package geography;

import java.util.HashSet;

public class Area {
	private String name;
	private Name names;
	private HashSet<Country> countries;
	
	public void addCountry(Country country){
		countries.add(country);
		country.addArea(this);
	}
	
	public boolean containsCountry(Country country){
		return countries.contains(country);
	}
	
}
