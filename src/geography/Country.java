package geography;

import java.util.HashSet;

public class Country {
	
	private String name;
	private Name names;
	private HashSet<String> languages;
	private Coordinates coordinates;
	private HashSet<Area> areas;
	private HashSet<City> cities;
	private Flag flag;
	
	public void addArea(Area area){
		areas.add(area);
	}
}
