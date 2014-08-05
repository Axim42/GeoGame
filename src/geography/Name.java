package geography;

import java.util.HashSet;

public class Name {
	
	private HashSet<String> names;
	
	public boolean hasName(String name){
		return names.contains(name);
	}

	/**
	 * @param names
	 */
	public Name(HashSet<String> names) {
		super();
		this.names = names;
	}

	@Override
	public String toString() {
		return "Name [names=" + names + "]";
	}
	
	
}
