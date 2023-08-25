package week1;

public class TwoWheeler {
	
	public int noOfWheels = 2;
	short noOfMirrors = 2;
	long chasisNumber = 178271919l;
	boolean isPunctured = false;
	String bikeName = "kawasaki";
	double runningKm = 22000.5;
	
	public static void main(String[] args)
	{
		TwoWheeler two = new TwoWheeler();
		System.out.println("Number of wheels" + two.noOfWheels);
		System.out.println("Number of Mirrors" + two.noOfMirrors);
		System.out.println("Chasis Number is" + two.chasisNumber);
		System.out.println("is bike punctured" + two.isPunctured);
		System.out.println("Bike name is" + two.bikeName);
		System.out.println("KM's" + two.runningKm);	
	}	
}
