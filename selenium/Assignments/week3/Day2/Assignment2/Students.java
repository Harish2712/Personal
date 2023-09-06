package week3assignment;

public class Students {

public void getStudentInfo() {
		
	}
	public void getStudentInfo(int id) {
		
		System.out.println(" Student Id :" +id);
			
		}
	public void getStudentInfo(String name, String email, String phone ) {
		
		System.out.println("Student name is:" + name + "," + "Student Email is:" + email + " , " + "Student phone no is:" + phone);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		
		s.getStudentInfo(356);
		s.getStudentInfo("David", "test@gmail.com" , "9876543210");
	}
}
