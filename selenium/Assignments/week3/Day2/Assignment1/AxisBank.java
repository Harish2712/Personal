package week3assignment;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Depot from Axis Bank");
	}

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		a.fixed();
		a.saving();
		a.deposit();
	}

}
