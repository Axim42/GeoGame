package geography;

public class City {
	private String name;
	private Name names;
	private Coordinates coordinates;
	
	/**
	 * @param name
	 * @param names
	 * @param coordinates
	 */
	public City(String name, Name names, Coordinates coordinates) {
		this.name = name;
		this.names = names;
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", names=" + names + ", coordinates="
				+ coordinates + "]";
	}
	
	
}
