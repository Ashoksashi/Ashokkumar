package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Student ID"+ id);
	}
	public void getStudentInfo(int id,String str) {
		// TODO Auto-generated method stub
		System.out.println("Student ID"+ id );
		System.out.println("Student Name"+ str );
	}
	public void getStudentInfo(String email,String phNum) {
		// TODO Auto-generated method stub
		System.out.println("Student email"+ email );
		System.out.println("Student phoneNumber"+ phNum );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj =new Students();
		obj.getStudentInfo(12);
		obj.getStudentInfo(12, "Arun");
		obj.getStudentInfo("arun@gmail.com", "9876543210");
	}

}
