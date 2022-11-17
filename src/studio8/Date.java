package studio8;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	public Date (int month1, int day1, int year1, boolean holiday1) {
		month = month1;
		day = day1;
		year = year1;
		holiday = holiday1;
		
		
	}
	
	

    public static void main(String[] args) {
    	int Date = 0; // date below is the data type in this case 
    	Date maybeHoliday = new Date(12, 24, 2031, true);
    	System.out.println(maybeHoliday);
    	

    }



	@Override
	public String toString() {
		if (holiday == true) {
			return "Date [" + month + "/" + day + "/" + year + ", is a holiday!!!!]";	
		}else {
			return "Date [" + month + "/" + day + "/" + year + "if not a holiday ):]";
		}
		
	}
    
	

}
