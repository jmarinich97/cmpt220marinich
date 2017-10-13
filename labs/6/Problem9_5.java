package cmpt220;

import java.util.GregorianCalendar;

public class Problem9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregCal = new GregorianCalendar();
		System.out.printf("The current year is %d\nThe current month is %d\nThe current day is %d\n\n"
				, gregCal.get(gregCal.YEAR), gregCal.get(gregCal.MONTH), gregCal.get(gregCal.DAY_OF_MONTH));
		
		gregCal.setTimeInMillis(1234567898765L);
		
		System.out.printf("The current year is %d\nThe current month is %d\nThe current day is %d"
				, gregCal.get(gregCal.YEAR), gregCal.get(gregCal.MONTH), gregCal.get(gregCal.DAY_OF_MONTH));
	}

}
