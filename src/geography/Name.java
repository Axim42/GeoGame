package geography;

import java.util.HashMap;

public class Name {
	
	private HashMap<String , String> names;
	

	
	
	public boolean hasName(String name){
		return names.get(name)!=null;
	}
}
