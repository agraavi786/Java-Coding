//ConvertKMperHour to MiliHours



package javaTutorials;

public class Kilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printConversion(-1.0);

	}
	public static void printConversion(double kiloMeterPerHours) {
		double miliHours =  kiloMeterPerHours*1.609;
		if (kiloMeterPerHours<0) {
			System.out.println("Invalid Value");
		}
		else {
			System.out.println(kiloMeterPerHours+"km/h = "+ miliHours + "mi/h"  );
		}
		
		
	}

}
