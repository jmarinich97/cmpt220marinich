package cmpt220;

public class Location {
	int row = 0;
	int column = 0;
	double maxValue = 0.0;
	
	public Location() {
		
	}
	
	public static Location locateLargest(double[][] a) {
		Location location = new Location();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
		return location;
	}

}
