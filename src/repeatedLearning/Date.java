package repeatedLearning;

import java.util.Calendar;

public class Date {
	
	
	private Calendar calendar;
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		calendar = new 
	}

	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
	
	private int getAD(){
		int temp = 0;
		for(int i = 1 ; i < month ; i++){
			switch(i){
			case 1:
				break;
			case 2:
				temp += 
			}
		}
		return year*365 + month
	}
}
