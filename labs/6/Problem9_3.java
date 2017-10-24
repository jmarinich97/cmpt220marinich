package cmpt220;

import java.util.Date;

public class Problem9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		date1.setTime(10000);
		System.out.println(date1.toString());

		date1.setTime(100000);
		System.out.println(date1.toString());

		date1.setTime(1000000);
		System.out.println(date1.toString());

		date1.setTime(10000000);
		System.out.println(date1.toString());

		date1.setTime(100000000);
		System.out.println(date1.toString());

		date1.setTime(1000000000);
		System.out.println(date1.toString());
		
		// JA
		date1.setTime(10000000000L);
		System.out.println(date1.toString());	
		date1.setTime(100000000000L);
		System.out.println(date1.toString());		
	}

}
