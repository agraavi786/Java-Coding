package javaTutorials;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double a , double b) {
		if((int)a*1000==(int)b*1000) {
			
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
		
		
		

	}

}
