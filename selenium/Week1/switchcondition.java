package week1day1;

public class Switchcondition {

	public Switchcondition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car = "BMW";
		
		switch(car) {
		case "audi" : System.out.println("Car is Audi");break;
		case "BMW" : System.out.println("car is BMW");break;
		case "Ferrari" : System.out.println("car is ferrari");break;
		case "Bugati" : System.out.println("car is bugati");break;
		default:System.out.println("car is Lambo");
		}

	}

}
